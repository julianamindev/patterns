package creational.abstractfactory.factories;

import creational.abstractfactory.creditcards.*;
import creational.abstractfactory.types.CardType;
import creational.abstractfactory.validators.AmexGoldValidator;
import creational.abstractfactory.validators.AmexPlatinumValidator;
import creational.abstractfactory.validators.Validator;

public class AmexFactory extends CreditCardFactory {
    public CreditCard getCreditCard(CardType cardType) {

        switch (cardType) {
            case GOLD: {
                return new AmexGoldCard();
            }
            case PLATINUM: {
                return new AmexPlatinumCard();
            }
            default: {
                return null;
            }
        }
    }

    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD: {
                return new AmexGoldValidator();
            }
            case PLATINUM: {
                return new AmexPlatinumValidator();
            }
            default: {
                return null;
            }
        }
    }
}
