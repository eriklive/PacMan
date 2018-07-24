public class Fantasma{
	private String direcao;

	private int x = 5;
	private int y = 5;

	private int ultimo_item = 0;

	public Fantasma(){
		setDirecao("c");
	}

	public void setDirecao(String direcao){
		this.direcao = direcao;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public void setUltimoItem(int ultimo_item){
		this.ultimo_item = ultimo_item;
	}

	public String getDirecao(){
		return this.direcao;
	}

	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}

	public int getUltimoItem(){
		return this.ultimo_item;
	}
}