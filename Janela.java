import javax.swing.JFrame;
import telas.*;

public class Janela{
	JFrame janela = new JFrame();

	public void criarJanela(){
		this.janela.setBounds(100,100,375,535);
		this.janela.setTitle("PACMAN");
		this.janela.setResizable(false);
		this.janela.setVisible(true);
		this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void addTela(Telas tela){
		this.janela.add(tela);
	}
	

}