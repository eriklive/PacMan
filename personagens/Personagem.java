package personagens;
import telas.Game;

public abstract class Personagem {
	private String direcao;

	private int x;
	private int y;

	public void setDirecao(String direcao){
		this.direcao = direcao;
	}

	public void setPosicao(int x){
		this.x = x;
	}
	
	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public void setPosicao(int x, int y){
		this.x = x;
		this.y = y;
	}

	public String getDirecao(){
		return direcao;
	}

	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}

	public static void acharPersonagem(Personagem personagem){
		int find;

		int[][] mapa = Game.getMap();

		if(personagem instanceof PacMan)
			find = 2;
		else
			find = 8;

		for(int i = 0; i< mapa.length; i++)
			for(int j = 0; j < mapa[j].length; i++)
				if(mapa[i][j] == find)
					personagem.setPosicao(j, i);
	}
}