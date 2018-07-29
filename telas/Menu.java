package telas;
import buttons.*;
import assets.GameSettings;
import assets.Score;
import assets.HiScore;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;	

public class Menu extends JPanel {
	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);

	    //Remove old stuff that still in here
		removeAll();
		
		GridLayout grid = new GridLayout(6,1);
        setLayout(grid);

		//Here we create one section for each thing
		JPanel sectionOne = new JPanel(new GridLayout(0,2));
		JPanel sectionTwo = new JPanel(new GridLayout(0,1));

		sectionOne.add(HiScore.addHiScore(), BorderLayout.PAGE_START);
		sectionOne.add(Score.addScore(), BorderLayout.PAGE_START);

		sectionTwo.add(StartButton.addStartButton(), BorderLayout.CENTER);
		sectionTwo.add(OptionsButton.addOptionsButton(), BorderLayout.CENTER);

		add(sectionOne);
		add(sectionTwo);

		g.setColor(Color.BLACK);
	    g.drawRect(0,0,GameSettings.getX(), GameSettings.getY());
	    g.fillRect(0,0,GameSettings.getX(), GameSettings.getY());

	    revalidate();
	}
}