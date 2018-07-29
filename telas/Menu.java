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

		GridLayout grid = new GridLayout(12,6);
        setLayout(grid);

		add(HiScore.addHiScore(), BorderLayout.PAGE_START);
		add(Score.addScore(), BorderLayout.PAGE_START);

		add(StartButton.addStartButton(), BorderLayout.CENTER);
		add(OptionsButton.addOptionsButton(), BorderLayout.CENTER);

	    g.setColor(Color.BLACK);
	    g.drawRect(0,0,GameSettings.getX(), GameSettings.getY());
	    g.fillRect(0,0,GameSettings.getX(), GameSettings.getY());
	}
}