package personagens;
import assets.Random;

public class Fantasma extends Personagem{
	private int ultimo_item;
	private String direcao;

	public Fantasma(){
		setX(7);
		setY(10);
		setUltimoItem(0);
		setDirecao("b");
	}

	public void setUltimoItem(int ultimo_item){
		this.ultimo_item = ultimo_item;
	}

	public int getUltimoItem(){
		return this.ultimo_item;
	}

	public void setLastPos(String posicao){
		this.direcao = posicao;
	}

	public String getLastPos(){
		return this.direcao;
	}

}