package telas;
import javax.swing.border.EmptyBorder;	
import javax.swing.*;
import java.awt.*;
import assets.GameSettings;
import assets.Score;
import assets.HiScore;
import buttons.*;

public class Menu extends JPanel {
	@Override
	public void paintComponent(Graphics g){
		Janela.updateJanela(375,605);
	    super.paintComponent(g);

	    //Remove old stuff that still in here
		removeAll();
		
		GridLayout grid = new GridLayout(6,1);
        setLayout(grid);

        JLabel pacman = new JLabel("PacMan");
        pacman.setFont(new Font("PacFont",Font.BOLD,55));
		pacman.setForeground(Color.YELLOW);

		//Here we create one section for each thing
		JPanel sectionOne = new JPanel(new GridLayout(0,2));
		JPanel sectionTwo = new JPanel(new GridLayout(0,1));
		JPanel sectionTree = new JPanel(new GridLayout(0,1));

		sectionOne.setBackground(Color.BLACK);
		sectionTwo.setBackground(Color.BLACK);
		sectionTree.setBackground(Color.BLACK);

		sectionOne.add(HiScore.addHiScore(), BorderLayout.PAGE_START);
		sectionOne.add(new Score(), BorderLayout.PAGE_START);

		sectionTwo.add(pacman, BorderLayout.CENTER);

		sectionTree.add(new StartButton(), BorderLayout.CENTER);
		sectionTree.add(new OptionsButton(), BorderLayout.CENTER);

		add(sectionOne);
		add(sectionTwo);
		add(sectionTree);

		g.setColor(Color.BLACK);
	    g.drawRect(0,0,GameSettings.getScreenX(), GameSettings.getScreenY());
	    g.fillRect(0,0,GameSettings.getScreenX(), GameSettings.getScreenY());

	    revalidate();
	}
}