package behavioral.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Director extends Handler {

    private static Logger log = LoggerFactory.getLogger(Director.class);

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            log.info("Directors can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
