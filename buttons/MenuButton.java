package buttons;
import java.awt.event.*;
import telas.Janela;

public class MenuButton extends Button{
	public MenuButton(){
		super("Voltar");
	}

	@Override
	public ActionListener actionListener(){
		return new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	        	Janela.menu();
	      	}
	    };
	} 
}