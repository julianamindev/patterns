package behavioral.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VP extends Handler {
    private static Logger log = LoggerFactory.getLogger(VP.class);
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE && request.getAmount() < 1500) {
            log.info("VP can approve purchases below 1500");
        } else {
            successor.handleRequest(request);
        }
    }
}
