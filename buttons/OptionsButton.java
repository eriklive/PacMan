package buttons;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import telas.*;

public class OptionsButton extends JButton{
	private static JButton optionsButton;

	private OptionsButton(){
		setFont(new Font("Press Start 2P",Font.BOLD,25));
		setForeground(Color.BLACK);
		setText("Opções");
		addActionListener(new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	        	Janela.opcoes();
	      	}
	    });
	}

	public static JButton addOptionsButton(){
		if(optionsButton == null)
			optionsButton = new OptionsButton();

		return optionsButton; 
	}
}