package buttons;
import java.awt.event.*;
import telas.*;

public class OptionsButton extends Button{
	public OptionsButton(){
		super("Opções");
	}
	
	@Override
	public ActionListener actionListener(){
		return new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	        	Janela.opcoes();
	      	}
	    };
	} 
}