// Classe com variáveis de indicações (flags)

package assets;
import telas.Game;

public abstract class Flags{
	private static boolean portal = false;

	public static void setPortal(int x, int y){
		if(Game.getMapValue(x, y) == 5 || Game.getMapValue(x, y) == 6 || Game.getMapValue(x, y) == 10 || Game.getMapValue(x, y) == 12)
			Flags.portal = true;
	}

	public static boolean isPortal(){
		return Flags.portal;
	}
}