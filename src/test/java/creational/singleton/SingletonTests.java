package creational.singleton;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonTests {

    private static Logger log = LoggerFactory.getLogger(SingletonTests.class);

    @Test
    public void tests() {
        long timeBefore = System.currentTimeMillis();
        DbSingleton instance = DbSingleton.getInstance();
        long timeAfter = System.currentTimeMillis();

        log.debug("{} ms", timeAfter - timeBefore);

        timeBefore = System.currentTimeMillis();
        DbSingleton anotherInstance = DbSingleton.getInstance();
        timeAfter = System.currentTimeMillis();

        log.debug("{} ms", timeAfter - timeBefore);
    }
}
