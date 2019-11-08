package structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.facade.system.*;

import java.io.File;

public class VideoConversionFacade {
    private static Logger log = LoggerFactory.getLogger(VideoConversionFacade.class);

    public File convertVideo(String fileName, String format) {
        log.info("VideoConversionFacade: conversion started...");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = new AudioMixer().fix(intermediateResult);
        log.info("VideoConversionFacade: conversion completed");
        return result;
    }
}
