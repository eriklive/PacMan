package movimentacao;
import personagens.*;
import telas.*;
import assets.Flags;
import assets.FindValue;

public class MovimentosFantasmas {

	private static void perdeu(int x, int y){
		if( Game.getMapValue(x, y) == 2 )
			Janela.endGame();
	}

	private static boolean isPortal(int x, int y, Fantasma fantasma){
		//If this position is a portal trigger, then this method makes the movement
		if(Flags.isPortal()){
			int nextPortal = Game.getNextPortal( Game.getMapValue(x, y) );

			int[] nextMove = FindValue.find(nextPortal);
			Game.setMapaValue(nextMove[0],nextMove[1], fantasma.getUltimoItem());

			fantasma.setX( nextMove[0] );

			return true;
		}

		return false;
	}

	private static void atualizarUltimoItem(Fantasma fantasma, int x, int y){
		if(fantasma.getUltimoItem()==8)
			Game.setMapaValue(x,y,0);

		else if(fantasma.getUltimoItem()==7)
			Game.setMapaValue(x,y,3);

		else
			Game.setMapaValue(x,y,fantasma.getUltimoItem());
	}

	private static void updateNextPos( Fantasma fantasma, int x, int y){
		if(isPortal(x, y, fantasma))
			return;

		if(Game.getMapValue(x,y)==0 || Game.getMapValue(x,y)==8)
			Game.setMapaValue(x, y, 8);

		else if(Game.getMapValue(x,y)==3 || Game.getMapValue(x,y)==7)
			Game.setMapaValue(x, y, 7);

		else if(Game.getMapValue(x,y)==5)
			Game.setMapaValue(x, y, 7);

		//atualizo o x do meu fantasma
		fantasma.setX( x );

		//Check if this position is a portal trigger
		Flags.setPortal(x, y);
	}

	public static boolean moverFantasmaX(Fantasma fantasma, int novo_x){
		int x = fantasma.getX();
		int y = fantasma.getY();

		if( Game.getMapValue(novo_x, y) != 1 ){ 
			//Verifica se o jogadir perdeu
			perdeu(novo_x, y);

			//Essa minha posição atual recebe de volta o item a que a ela pertencia
			atualizarUltimoItem(fantasma,x, y);

			//atualizo o ultimo item com o item o qual o fantasma vai se sobrepor
			fantasma.setUltimoItem( Game.getMapValue(novo_x,y) ); 

			//Sobreponho a ṕróxima posição com meu fantasma
			updateNextPos(fantasma, novo_x, y);

			perdeu(x, y);

			return true;
		} else {
			return false;
		}

	}

	public static boolean moverFantasmaY(Fantasma fantasma, int novo_y){
		int x = fantasma.getX();
		int y = fantasma.getY();

		if(Game.getMapValue(x, novo_y) != 1){
			perdeu(x, novo_y);

			//Essa minha posição atual recebe de volta o item a que a ela pertencia
			atualizarUltimoItem(fantasma, x, y);

			//atualizo o ultimo item com o item o qual o fantasma vai se sobrepor
			fantasma.setUltimoItem( Game.getMapValue(x,novo_y) ); 
			
			//Sobreponho a ṕróxima posição com meu fantasma
			updateNextPos(fantasma, x, novo_y);

			fantasma.setY(novo_y);

			perdeu(x, y);

			return true;
		} else {
			return false;
		}
	}

}