package personagens;
import assets.Random;
import assets.GameSettings;

public class Fantasma extends Personagem{
	private int ultimo_item;

	public Fantasma(){
		int[][] mapa = GameSettings.getMap();

		for(int i = 0; i<mapa.length; i++)
			for(int j = 0; j<mapa[0].length; j++)
				if(mapa[i][j] == 9) {
					setX(j);
					setY(i);
				}
		
		setUltimoItem(0);
		setDirecao("b");
	}

	public void setUltimoItem(int ultimo_item){
		this.ultimo_item = ultimo_item;
	}

	public int getUltimoItem(){
		return this.ultimo_item;
	}
}