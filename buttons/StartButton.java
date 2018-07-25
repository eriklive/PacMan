package buttons;
import javax.swing.JButton;
import java.awt.event.*;
import telas.*;

public class StartButton extends JButton{
	
	public StartButton(){
		setText("start");

		addActionListener(new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	        	Janela.start();
	      	}
	    });
	}

}