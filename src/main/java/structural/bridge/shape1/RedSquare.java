package structural.bridge.shape1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedSquare extends Square {
    private static Logger log = LoggerFactory.getLogger(RedSquare.class);
    @Override
    public void applyColor() {
        log.info("applying red color");
    }
}
