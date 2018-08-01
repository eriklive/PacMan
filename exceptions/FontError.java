package exceptions;
import javax.swing.JOptionPane;

public class FontError extends Exception{
	public FontError(String font){
		super("Erro ao carregar a fonte " + font);
		JOptionPane.showMessageDialog(null, "Erro ao carregar a fonte " + font);
	}
}