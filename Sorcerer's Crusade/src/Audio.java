import javax.sound.sampled.*;
import java.io.*;
import java.net.URL;

public class Audio {

    Clip audioClip;

    public Audio(String filePath) {
        try {
            URL musicUrl = Audio.class.getResource(filePath);
            AudioInputStream musicStream = AudioSystem.getAudioInputStream(musicUrl);
            audioClip = AudioSystem.getClip();
            audioClip.open(musicStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        if (audioClip != null) {
            audioClip.start();
        }
    }

    public void stop() {
        if (audioClip != null) {
            audioClip.stop();
        }
            
    }

    public void close() {
        if (audioClip != null) {
            audioClip.close();
        }
    }
    
    public void rewind() {
        if (audioClip != null) {
            audioClip.stop();
            audioClip.setFramePosition(0);
            audioClip.start();
        }
    }
}

