package behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyDemo {
    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("340000000000009");
        amexCard.setDate("07/2020");
        amexCard.setCvv("123");

        log.info("Is Amex valid: {}", amexCard.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());

        visaCard.setNumber("4111111111111112");
        visaCard.setDate("07/2020");
        visaCard.setCvv("123");

        log.info("Is Visa valid: {}", visaCard.isValid());
    }
}
