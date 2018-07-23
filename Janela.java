import javax.swing.JFrame;

public class Janela{
	JFrame janela = new JFrame();

	public void criarJanela(){
		this.janela.setBounds(0,0,550,585);
		this.janela.setTitle("PACMAN");
		this.janela.setResizable(false);
		this.janela.setVisible(true);
		this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void addTela(Telas tela){
		this.janela.add(tela);
	}
	

}