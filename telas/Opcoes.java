package telas;
import buttons.ChooseMapButton;
import buttons.MenuButton;
import assets.GameSettings;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;	

public class Opcoes extends JPanel {
	private JButton chooseMapButton;

	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);

	    //Remove old stuff that still in here
		removeAll();

		ChooseMapButton buttonOne = new ChooseMapButton("Um", 1);
		ChooseMapButton buttonTwo = new ChooseMapButton("Dois", 2);
		ChooseMapButton buttonTree = new ChooseMapButton("Três", 3);
		MenuButton voltar = new MenuButton();

		GridLayout grid = new GridLayout(12,1);

		JLabel txtChoose = new JLabel("Escolha um mapa: ");
		
		voltar.setFont(new Font("Press Start 2P",Font.BOLD,10));
		voltar.setForeground(Color.RED);
		txtChoose.setFont(new Font("Press Start 2P",Font.BOLD,15));
		txtChoose.setForeground(Color.BLACK);
		buttonOne.setFont(new Font("Press Start 2P",Font.BOLD,15));
		buttonOne.setForeground(Color.BLACK);
		buttonTwo.setFont(new Font("Press Start 2P",Font.BOLD,15));
		buttonTwo.setForeground(Color.BLACK);
		buttonTree.setFont(new Font("Press Start 2P",Font.BOLD,15));
		buttonTree.setForeground(Color.BLACK);


		//Here we create one section for each thing
		JPanel sectionOne = new JPanel(new GridLayout(0,3));
		JPanel sectionTwo = new JPanel(new GridLayout(1,1));
		JPanel sectionTree = new JPanel(new GridLayout(1,3));

        setLayout(grid);

		sectionOne.add(voltar, BorderLayout.CENTER);


		sectionTwo.add(txtChoose, BorderLayout.CENTER);

		sectionTree.add(buttonOne, BorderLayout.CENTER);
		sectionTree.add(buttonTwo, BorderLayout.CENTER);
		sectionTree.add(buttonTree, BorderLayout.CENTER);

		add(sectionOne);
		add(sectionTwo);
		add(sectionTree);

	    g.setColor(Color.BLACK);
	    g.drawRect(0,0,GameSettings.getX(), GameSettings.getY());
	    g.fillRect(0,0,GameSettings.getX(), GameSettings.getY());

	    revalidate();
	}

	
}