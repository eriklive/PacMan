// Implements this on entire game
package assets;

public abstract class GameSettings{
	private static int screenSizeX = 375;
	private static int screenSizeY = 605;
	private static int paddingTop = 50;
	private static int score = 0;
	private static int dificuldade = 4;
	private static boolean game_over = false;

	public void setScreenSize(int x, int y){
		this.screenSizeX = 375;
		this.screenSizeY = 555;
	}

	public static int getX(){
		return screenSizeX;
	}

	public static int getY(){
		return screenSizeY;
	}

	public static int getPaddingY(){
		return paddingTop;
	}

	public static int getScore(){
		return score;
	}

	public static void addScore(){
		score++;
	}

	public static void resetScore(){
		score=0;
	}

	public static boolean gameOver(){
		return game_over;
	}

	public static void setGameOver(Boolean change){
		game_over = change;
	}

	public static int getDificuldade(){
		return dificuldade;
	}
}