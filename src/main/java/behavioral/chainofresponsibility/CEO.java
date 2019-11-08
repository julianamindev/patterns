package behavioral.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CEO extends Handler {
    private static Logger log = LoggerFactory.getLogger(CEO.class);
    @Override
    public void handleRequest(Request request) {
        log.info("CEOs can approve anything");
    }
}
