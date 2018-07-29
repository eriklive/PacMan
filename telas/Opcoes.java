package telas;
import buttons.*;
import assets.GameSettings;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;	

public class Opcoes extends JPanel {
	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);

	    JLabel opcoes = new JLabel("Opções");

	    opcoes.setForeground(Color.red);

	    add(opcoes, BorderLayout.PAGE_START);

	    g.setColor(Color.BLACK);
	    g.drawRect(0,0,GameSettings.getX(), GameSettings.getY());
	    g.fillRect(0,0,GameSettings.getX(), GameSettings.getY());
	}

	
}