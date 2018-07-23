public class Principal{
	public static void main(String args[]){
		Janela janela = new Janela();
		Telas tela = new Telas();
		
		janela.criarJanela();
		janela.addTela(tela);
	}
}