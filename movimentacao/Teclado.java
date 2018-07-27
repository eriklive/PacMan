package movimentacao;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Teclado implements KeyListener {
    
    private String dir = "d";

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed (KeyEvent e) {
        int keyCode = e.getKeyCode ();

        if (keyCode == e.VK_LEFT) {
            this.dir = "e";
            System.out.println("oi");
        }
        if (keyCode == e.VK_RIGHT) {
           this.dir = "d";
        }
        if (keyCode == e.VK_UP) {
           this.dir = "c";
        }
        if (keyCode == e.VK_DOWN) {
            this.dir = "b";
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    	
    }
    
    public String getDirTeclado() {
        return this.dir;
    }
      
}