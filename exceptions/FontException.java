package exceptions;
import javax.swing.JOptionPane;

public class FontException extends Exception{
	public FontException(String font){
		super("Erro ao carregar a fonte " + font);
		JOptionPane.showMessageDialog(null, "Erro ao carregar a fonte " + font);
	}
}