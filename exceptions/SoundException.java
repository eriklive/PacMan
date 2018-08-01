package exceptions;
import javax.swing.JOptionPane;

public class SoundException extends Exception{
	public SoundException(String audioClip){
		super("Erro ao carregar o arquivo de áudio " + audioClip);
		JOptionPane.showMessageDialog(null, "Erro ao carregar o arquivo de áudio " + audioClip);
	}
}