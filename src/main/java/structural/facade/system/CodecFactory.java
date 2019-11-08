package structural.facade.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CodecFactory {

    private static Logger log = LoggerFactory.getLogger(CodecFactory.class);

    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            log.info("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            log.info("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
