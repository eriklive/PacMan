package telas;
import buttons.*;
import assets.GameSettings;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;	

public class Opcoes extends JPanel {
	private JButton chooseMapButton;

	public Opcoes(){
		chooseMapButton = ChooseMapButton.addChooseMapButton();
	}

	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
		
		System.out.println("Janela de opções carregada.");
		
		GridLayout grid = new GridLayout(12,6);
        setLayout(grid);

		add(chooseMapButton, BorderLayout.PAGE_START);
		add(ChooseMapButton.addChooseMapButton(), BorderLayout.PAGE_START);

	    g.setColor(Color.BLACK);
	    g.drawRect(0,0,GameSettings.getX(), GameSettings.getY());
	    g.fillRect(0,0,GameSettings.getX(), GameSettings.getY());
	}

	
}