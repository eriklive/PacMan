import telas.*;
import assets.Fonts;

public class Principal{
	public static 	int x = 1;

	public static void main(String args[]) throws Exception{
		Janela janela = new Janela();
		
		Fonts.load();

		janela.criarJanela();
	}
}