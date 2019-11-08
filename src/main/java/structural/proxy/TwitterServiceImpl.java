package structural.proxy;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

@Slf4j
public class TwitterServiceImpl implements TwitterService {

    private static final String TWITTER_CONSUMER_KEY = "eIq09MUQYby50cFekJ0w4r30f";
    private static final String TWITTER_SECRET_KEY = "w3PcsBC4khV9C2rkBBtQYUFrHNqdHMF6x8nXE9mEFfHGdquwGK";
    private static final String TWITTER_ACCESS_TOKEN = "1184042175971020800-a74ZHMZRaYZpX0j44unGT54Pu6NOdQ";
    private static final String TWITTER_ACCESS_TOKEN_SECRET = "ije7I23FiY50MGCtAs94QaZyJkiBmbfUhxeeqcU8NYQYB";

    @Override
    public String getTimeline(String screenName) {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
                .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
                .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

        StringBuilder builder = new StringBuilder();

        try {
            Query query = new Query(screenName);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    builder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                    builder.append("\n");
                }
            } while ((query = result.nextQuery()) != null);
        } catch (TwitterException te) {
            te.printStackTrace();
            log.error("Failed to search tweets: {}", te.getMessage());
        }

        return builder.toString();
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
