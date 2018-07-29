package sounds;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class EatingSound implements Sounds{
    Clip clip;

	@Override
	public void play() {
		getSong();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
	}

	public void stop() {
        clip.stop();
	}

	private void getSong() {
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("eating.wav").getAbsoluteFile());
	        clip = AudioSystem.getClip();
        	this.clip.open( audioInputStream );
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
}