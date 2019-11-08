package creational.abstractfactory.factories;

import creational.abstractfactory.creditcards.CreditCard;
import creational.abstractfactory.creditcards.VisaBlackCreditCard;
import creational.abstractfactory.creditcards.VisaGoldCreditCard;
import creational.abstractfactory.types.CardType;
import creational.abstractfactory.validators.Validator;
import creational.abstractfactory.validators.VisaValidator;

public class VisaFactory extends CreditCardFactory {

    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD: {
                return new VisaGoldCreditCard();
            }
            case PLATINUM: {
                return new VisaBlackCreditCard();
            }
        }

        return null;
    }

    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }
}
