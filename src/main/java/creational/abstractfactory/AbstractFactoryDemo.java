package creational.abstractfactory;

import creational.abstractfactory.creditcards.CreditCard;
import creational.abstractfactory.factories.CreditCardFactory;
import creational.abstractfactory.types.CardType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractFactoryDemo {
    private static Logger log = LoggerFactory.getLogger(AbstractFactoryDemo.class);

    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        log.info("{}", card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);

        log.info("{}", card2.getClass());
    }
}
