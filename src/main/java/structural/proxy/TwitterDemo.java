package structural.proxy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import twitter4j.Paging;
import twitter4j.Status;

import java.util.List;

public class TwitterDemo {
    private static Logger log = LoggerFactory.getLogger(TwitterDemo.class);

    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
//JulianA07100147
        log.info("{}", service.getTimeline("JulianA07100147"));
        //Paging paging = new Paging(1, 100);

        //List<Status> statuses = service.getUser

        //service.postToTimeline("JulianA07100147", "sample tweet");
    }
}
