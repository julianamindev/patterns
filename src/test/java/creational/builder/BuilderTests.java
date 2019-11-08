package creational.builder;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuilderTests {

    private static Logger log = LoggerFactory.getLogger(BuilderTests.class);

    @Test
    public void tests() {
        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        log.debug("bread = {}, condiments = {}, dressing = {}, meat = {}",
                lunchOrder.getBread(), lunchOrder.getCondiments(), lunchOrder.getDressing(), lunchOrder.getMeat());
    }
}
