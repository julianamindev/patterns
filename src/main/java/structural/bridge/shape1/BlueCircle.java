package structural.bridge.shape1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlueCircle extends Circle {

    private static Logger log = LoggerFactory.getLogger(BlueCircle.class);
    @Override
    public void applyColor() {
        log.info("applying blue color");
    }
}
