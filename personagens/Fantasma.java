package personagens;

public class Fantasma extends Personagem{
	private int ultimo_item;

	public Fantasma(){
		setX(3);
		setY(3);
		setUltimoItem(0);
		setDirecao("c");
	}

	public void setUltimoItem(int ultimo_item){
		this.ultimo_item = ultimo_item;
	}

	public int getUltimoItem(){
		return this.ultimo_item;
	}
}