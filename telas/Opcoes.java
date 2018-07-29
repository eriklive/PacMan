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

	    GridLayout grid = new GridLayout(12,6);
        setLayout(grid);

	    JLabel opcoes = new JLabel("Opções");
	    opcoes.setForeground(Color.white);

	    add(opcoes, BorderLayout.PAGE_START);

	    g.setColor(Color.BLACK);
	    g.drawRect(0,0,GameSettings.getX(), GameSettings.getY());
	    g.fillRect(0,0,GameSettings.getX(), GameSettings.getY());
	}

	
}