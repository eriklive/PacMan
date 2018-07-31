package buttons;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

public abstract class Button extends JButton {
	public Button (String texto){
		this.setFont(new Font("Press Start 2P",Font.BOLD,25));
		this.setForeground(Color.BLACK);
		this.setText(texto);
		this.addActionListener( actionListener() );
	}

	abstract ActionListener actionListener();
}