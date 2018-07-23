import java.awt.*;

public class DesenharFormas{
	//Desenha um bloco de 50x50px
	public static void drawParede(Graphics g, int x, int y) {
		x = x*50;
		y = y*50;

        g.setColor(Color.BLUE);
        g.drawRect(x,y,50,50);
        g.fillRect(x,y,50,50);
    }

	//Desenha um bloco de 50x50px preto
    public static void drawNada(Graphics g, int x, int y) {
    	x = x*50;
		y = y*50;

        g.setColor(Color.BLACK);
        g.drawRect(x,y,50,50);
        g.fillRect(x,y,50,50);
    }

	//Desenha um cícurlo de 50x50px com fundo preto (vulgo PacMan)
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

	//Desenha um cícurlo de roxo 50x50px com fundo preto (vulgo PacMan)
    public static void drawGhost(Graphics g, int x, int y) {
    	x = x*50;
		y = y*50;

		//background
		g.setColor(Color.BLACK);
        g.drawRect(x,y,50,50);
        g.fillRect(x,y,50,50);

        //Ghost
        g.setColor(Color.MAGENTA);
        g.drawOval(x,y,50,50);
        g.fillOval(x,y,50,50);
    }

	//Desenha um cícurlo de 20x20px com fundo preto (moedas)
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