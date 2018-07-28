package movimentacao;
import personagens.*;
import telas.*;
import assets.GameSettings;
import assets.FindValue;
import assets.Flags;

public class MovimentosPacMan {
	private static boolean isPortal(int x, int y, PacMan pacman){
		//If this position is a portal trigger, then this method makes the movement
		if(Flags.isPortal()){
			int nextPortal = Game.getNextPortal( Game.getMapValue(x, y) );

			int[] nextMove = FindValue.find(nextPortal);

			Game.setMapaValue(x,y, 0);
			Game.setMapaValue(nextMove[0],nextMove[1], 2);

			return true;
		}

		return false;
	}

	public static void moverPacManX(PacMan pacman, int novo_x){
		int x = pacman.getX();
		int y = pacman.getY();

		if(isPortal(x, y, pacman))
			return;

		if( Game.getMapValue(novo_x, y) != 1 ){ //novo x não é parede
			if(Game.getMapValue(novo_x, y) == 3)
				GameSettings.addScore();

			//Essa minha posição atual recebe de volta o item a que a ela pertencia
			Game.setMapaValue(x,y,0);

			//Sobreponho a ṕróxima posição com meu pacman
			Game.setMapaValue(novo_x,y,2);

			//atualizo o x do meu pacman
			pacman.setX( novo_x );
		}

	}

	public static void moverPacManY(PacMan pacman, int novo_y){
		int x = pacman.getX();
		int y = pacman.getY();

		if(Game.getMapValue(x,novo_y) != 1){
			if(Game.getMapValue(x, novo_y) == 3)
				GameSettings.addScore();
			
			Game.setMapaValue(x,y,0);
			Game.setMapaValue(x,novo_y,2);

			pacman.setY( novo_y );
		}
	}
}