package personagens;
import assets.DesenharFormas;

public class PacMan extends Personagem {
	private int ultimo_item;
	
	public PacMan(){
		setX(8);
		setY(6);
		setDirecao("b");
	}
}