package buttons;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import telas.*;

public class StartButton extends Button{
	public StartButton(){
		super("Iniciar Jogo");
	}

	@Override
	public ActionListener actionListener(){
		return new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	        	Janela.start();
	      	}
	    };
	} 
}