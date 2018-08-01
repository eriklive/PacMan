package sounds;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import exceptions.SoundError;

public class EatingSound implements Sounds{
    Clip clip;

	@Override
	public void play() {
		try {
			getSong();
		} catch(SoundError e){
			new SoundError("Eating Clip");
		}
		
        clip.loop(Clip.LOOP_CONTINUOUSLY);
	}

	public void stop() {
        clip.stop();
	}

	private void getSong() throws SoundError{
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("assets/sounds/eating.wav").getAbsoluteFile());
	        clip = AudioSystem.getClip();
        	this.clip.open( audioInputStream );
	    } catch(Exception e) {
	        throw new SoundError("Eating Clip");
	    }
	}
}