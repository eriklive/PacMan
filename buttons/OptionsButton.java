package buttons;
import javax.swing.JButton;
import java.awt.event.*;
import telas.*;

public class OptionsButton extends JButton{
	private static JButton optionsButton;

	private OptionsButton(){
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