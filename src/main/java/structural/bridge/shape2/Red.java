package structural.bridge.shape2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Red implements Color {
    private static Logger log = LoggerFactory.getLogger(Red.class);
    @Override
    public void applyColor() {
        log.info("applying red color");
    }
}
