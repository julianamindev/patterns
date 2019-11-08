package creational.abstractfactory.validators;

import creational.abstractfactory.creditcards.CreditCard;

public class VisaValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
