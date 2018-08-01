package personagens;

public class PacMan extends Personagem {
	public static boolean bocaAberta = false;

	public PacMan(){
		acharPersonagem();
		setDirecao("d");
	}
}