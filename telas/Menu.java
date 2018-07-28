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
	    // setBorder(new EmptyBorder(4,4,4,4));

	    // add(Score.addScore(), BorderLayout.PAGE_START);
	    add(HiScore.addHiScore(), BorderLayout.PAGE_START);
	    // add(new JSeparator(), BorderLayout.CENTER	);
		add(StartButton.addStartButton(), BorderLayout.CENTER);

	    g.setColor(Color.BLACK);
	    g.drawRect(0,0,GameSettings.getX(), GameSettings.getY());
	    g.fillRect(0,0,GameSettings.getX(), GameSettings.getY());
	}

	
}