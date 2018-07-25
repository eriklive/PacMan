package telas;
import javax.swing.JPanel;
import java.awt.*;
import buttons.*;

public class Menu extends JPanel {

	@Override
	public void paintComponent(Graphics g){
		add(new StartButton());

	    super.paintComponent(g);
	}

	
}