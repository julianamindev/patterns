package structural.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyweightDemo {
    private static Logger log = LoggerFactory.getLogger(FlyweightDemo.class);

    public static void main(String[] args) {
        InventorySystem ims = new InventorySystem();

        ims.takeOrder("Television", 1000);
        ims.takeOrder("Radio", 1001);
        ims.takeOrder("Television", 1003);

        ims.process();

        log.info("{}", ims.report());
    }
}
