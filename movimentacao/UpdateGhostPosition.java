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
							// while(( fantasma[i].getLastPos() ).equals("d")){
							// 	Random.sorteia();
							// }

							podeAndar=MovimentosFantasmas.moverFantasmaX(fantasma[i], fantasma[i].getX() + 1);
							// fantasma[i].setLastPos("d");
							
							break;
				
						case "e":
							// while(( fantasma[i].getLastPos() ).equals("d")){
							// 	Random.sorteia();
							// }

							podeAndar=MovimentosFantasmas.moverFantasmaX(fantasma[i], fantasma[i].getX() - 1);
							// fantasma[i].setLastPos("e");

							break;
				
						case "b":
							// while(( fantasma[i].getLastPos() ).equals("d")){
							// 	Random.sorteia();
							// }

							podeAndar=MovimentosFantasmas.moverFantasmaY(fantasma[i], fantasma[i].getY() + 1);
							// fantasma[i].setLastPos("b");
							
							break;
				
						case "c":
							// while(( fantasma[i].getLastPos() ).equals("d")){
							// 	Random.sorteia();
							// }

							podeAndar=MovimentosFantasmas.moverFantasmaY(fantasma[i], fantasma[i].getY() - 1);		
							// fantasma[i].setLastPos("c");
							
							break;
					}
				}
			}
		}
	}
}