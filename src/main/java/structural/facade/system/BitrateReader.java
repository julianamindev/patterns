package structural.facade.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BitrateReader {

    private static Logger log = LoggerFactory.getLogger(BitrateReader.class);

    public static VideoFile read(VideoFile file, Codec codec) {
        log.info("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        log.info("BitrateReader: writing file...");
        return buffer;
    }
}
