package creational.abstractfactory.validators;

import creational.abstractfactory.creditcards.CreditCard;

public class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
