package structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecoratorDemo {
    private static Logger log = LoggerFactory.getLogger(DecoratorDemo.class);

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        log.info("{}", sandwich.make());
    }
}
