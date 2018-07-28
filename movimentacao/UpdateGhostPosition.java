package movimentacao;
import personagens.Fantasma;
import assets.Random;

public abstract class UpdateGhostPosition {
	private static int cont = 0;

	public static void moveGhost(Fantasma[] fantasma){
		for(int i = 0; i<fantasma.length; i++){
			if(cont < 12) {
				MovimentosFantasmas.moverFantasmaY(fantasma[i], fantasma[i].getY() - 1);
				cont+=1;
			} else {
				boolean podeAndar = false;

				while(!podeAndar) {	
					switch( Random.sorteia() ){
						case "d":
							if(( fantasma[i].getLastPos() ).equals("e")){
								podeAndar=MovimentosFantasmas.moverFantasmaX(fantasma[i], fantasma[i].getX() + 1);
								fantasma[i].setLastPos("d");
							}
							break;
				
						case "e":
							// if(( fantasma[i].getLastPos() ).equals("d")){
								podeAndar=MovimentosFantasmas.moverFantasmaX(fantasma[i], fantasma[i].getX() - 1);
								// fantasma[i].setLastPos("e");
							// }
							break;
				
						case "b":
							// if(( fantasma[i].getLastPos() ).equals("c")){
								podeAndar=MovimentosFantasmas.moverFantasmaY(fantasma[i], fantasma[i].getY() + 1);
								// fantasma[i].setLastPos("b");
							// }
							break;
				
						case "c":
							// if(( fantasma[i].getLastPos() ).equals("b")){
								podeAndar=MovimentosFantasmas.moverFantasmaY(fantasma[i], fantasma[i].getY() - 1);		
								// fantasma[i].setLastPos("c");
							// }	
							break;
					}
				}
			}
		}
	}
}