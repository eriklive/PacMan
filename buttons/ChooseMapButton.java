package buttons;
import javax.swing.JButton;
import java.awt.event.*;
import telas.*;

public class ChooseMapButton extends JButton{
	private static JButton chooseMapButton;

	private ChooseMapButton(){
		setText("Mapa um");
		
		addActionListener(new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	        	Janela.opcoes();
	      	}
	    });
	}

	public static JButton addChooseMapButton(){
		if(chooseMapButton == null)
			chooseMapButton = new ChooseMapButton();

		return chooseMapButton; 
	}
}