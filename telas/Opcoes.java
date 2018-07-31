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

		ChooseMapButton buttonOne = new ChooseMapButton("1", 1);
		ChooseMapButton buttonTwo = new ChooseMapButton("2", 2);
		ChooseMapButton buttonTree = new ChooseMapButton("3", 3);
		ChooseMapButton buttonFour = new ChooseMapButton("4", 4);
		ChooseMapButton buttonFive = new ChooseMapButton("5", 5);
		MenuButton voltar = new MenuButton();

		GridLayout grid = new GridLayout(12,1);

		JLabel txtChoose = new JLabel("Escolha um mapa: ");
		
		voltar.setFont(new Font("Press Start 2P",Font.BOLD,10));
		voltar.setForeground(Color.RED);

		txtChoose.setFont(new Font("Press Start 2P",Font.BOLD,15));
		txtChoose.setForeground(Color.WHITE);

		buttonOne.setFont(new Font("Press Start 2P",Font.BOLD,15));
		buttonOne.setForeground(Color.BLACK);

		buttonTwo.setFont(new Font("Press Start 2P",Font.BOLD,15));
		buttonTwo.setForeground(Color.BLACK);

		buttonTree.setFont(new Font("Press Start 2P",Font.BOLD,15));
		buttonTree.setForeground(Color.BLACK);

		buttonFour.setFont(new Font("Press Start 2P",Font.BOLD,15));
		buttonFour.setForeground(Color.BLACK);

		buttonFive.setFont(new Font("Press Start 2P",Font.BOLD,15));
		buttonFive.setForeground(Color.BLACK);

		//Here we create one section for each thing
		JPanel sectionOne = new JPanel(new GridLayout(0,3));
		JPanel sectionTwo = new JPanel(new GridLayout(1,1));
		JPanel sectionTree = new JPanel(new GridLayout(1,4));

        setLayout(grid);

		sectionOne.add(voltar, BorderLayout.CENTER);
		sectionOne.setBackground(Color.BLACK);

		sectionTwo.add(txtChoose, BorderLayout.CENTER);
		sectionTwo.setBackground(Color.BLACK);

		sectionTree.add(buttonOne, BorderLayout.CENTER);
		sectionTree.add(buttonTwo, BorderLayout.CENTER);
		sectionTree.add(buttonTree, BorderLayout.CENTER);
		sectionTree.add(buttonFour, BorderLayout.CENTER);
		sectionTree.add(buttonFive, BorderLayout.CENTER);
		sectionTree.setBackground(Color.BLACK);

		add(sectionOne);
		add(sectionTwo);
		add(sectionTree);

	    g.setColor(Color.BLACK);
	    g.drawRect(0,0,GameSettings.getScreenX(), GameSettings.getScreenY());
	    g.fillRect(0,0,GameSettings.getScreenX(), GameSettings.getScreenY());

	    revalidate();
	}
}