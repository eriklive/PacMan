import javax.swing.Timer;
import java.awt.event.*;
import telas.Telas;

public class Principal{
	public static 	int x = 1;

	public static void main(String args[]) throws Exception{
		
		Janela janela = new Janela();
		Telas tela = new Telas();
		
		janela.criarJanela();
		janela.addTela(tela);

		// Time loop
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               	tela.updateGhost();
               	tela.updatePacMan();
				tela.repaint();
            }
        };

        Timer timer = new Timer(400, taskPerformer);
        timer.setRepeats(true);
        timer.start();

        Thread.sleep(1000);
	}
}