package structural.bridge.shape2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Blue implements Color {
    private static Logger log = LoggerFactory.getLogger(Blue.class);
    @Override
    public void applyColor() {
        log.info("applying blue color");
    }
}
