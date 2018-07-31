package buttons;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

public abstract class Button extends JButton {
	public Button (String texto){
		setFont(new Font("Press Start 2P",Font.BOLD,25));
		setForeground(Color.BLACK);
		setText(texto);
		addActionListener( actionListener() );
	}

	abstract ActionListener actionListener();
}