package creational.abstractfactory.factories;

import creational.abstractfactory.creditcards.CreditCard;
import creational.abstractfactory.types.CardType;
import creational.abstractfactory.validators.Validator;

public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore) {

        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
