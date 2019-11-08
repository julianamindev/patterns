package creational.abstractfactory.validators;

import creational.abstractfactory.creditcards.CreditCard;

public interface Validator {
    boolean isValid(CreditCard creditCard);
}
