package exceptions;
import javax.swing.JOptionPane;

public class SoundError extends Exception{
	public SoundError(String audioClip){
		super("Erro ao carregar o arquivo de áudio " + audioClip);
		JOptionPane.showMessageDialog(null, "Erro ao carregar o arquivo de áudio " + audioClip);
	}
}