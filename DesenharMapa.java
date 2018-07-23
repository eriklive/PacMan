import java.awt.*;

public class DesenharMapa{
	public static void drawParede(Graphics g, int x, int y) {
		x = x*50;
		y = y*50;

        g.setColor(Color.BLUE);
        g.drawRect(x,y,50,50);
        g.fillRect(x,y,50,50);
    }

    public static void drawNada(Graphics g, int x, int y) {
    	x = x*50;
		y = y*50;

        g.setColor(Color.BLACK);
        g.drawRect(x,y,50,50);
        g.fillRect(x,y,50,50);
    }

    public static void drawPacMan(Graphics g, int x, int y) {
    	x = x*50;
		y = y*50;
		g.setColor(Color.BLACK);
        g.drawRect(x,y,50,50);
        g.fillRect(x,y,50,50);
        g.setColor(Color.YELLOW);
        g.drawOval(x,y,50,50);
        g.fillOval(x,y,50,50);
    }

    public static void drawCoin(Graphics g, int x, int y) {
    	x = x*50;
		y = y*50;
		g.setColor(Color.BLACK);
        g.drawRect(x,y,50,50);
        g.fillRect(x,y,50,50);

        x+=15;
        y+=15;
        
        g.setColor(Color.YELLOW);
        g.drawOval(x,y,20,20);
        g.fillOval(x,y,20,20);
    }
}