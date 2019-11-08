package structural.facade.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class AudioMixer {
    private static Logger log = LoggerFactory.getLogger(AudioMixer.class);
    public File fix(VideoFile result) {
        log.info("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
