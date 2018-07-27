package telas;
import javax.swing.JPanel;
import java.awt.*;
import buttons.*;
import assets.GameSettings;

public class Menu extends JPanel {
	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
		add(StartButton.addStartButton());

	    g.setColor(Color.BLACK);
	    g.drawRect(0,0,GameSettings.getX(), GameSettings.getY());
	    g.fillRect(0,0,GameSettings.getX(), GameSettings.getY());
	}

	
}