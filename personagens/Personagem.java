package personagens;

public abstract class Personagem {
	private String direcao;

	private int x;
	private int y;

	public void setDirecao(String direcao){
		this.direcao = direcao;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
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
}