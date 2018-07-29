package buttons;
import javax.swing.JButton;
import java.awt.event.*;
import telas.Janela;

public class MenuButton extends JButton{
	public MenuButton(){
		setText("Voltar");
		addActionListener( actionListener() );
	}

	private ActionListener actionListener(){
		return new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	        	Janela.menu();
	      	}
	    };
	} 
}