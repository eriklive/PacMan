// Implements this on entire game
package assets;

public abstract class GameSettings{
	private static int screenSizeX = 375;
	private static int screenSizeY = 605;
	private static int paddingTop = 50;
	private static int score = 0;

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
}