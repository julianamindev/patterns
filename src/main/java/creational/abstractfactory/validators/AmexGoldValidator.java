package creational.abstractfactory.validators;

import creational.abstractfactory.creditcards.CreditCard;

public class AmexGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
