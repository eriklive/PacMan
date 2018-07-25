package telas;
import javax.swing.JPanel;
import java.awt.*;

public class Menu extends JPanel{

	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);

	    g.setColor(Color.BLACK);
	    g.drawRect(0,0,100,100);
	    g.fillRect(0,0,100,100); 
	}

    
}