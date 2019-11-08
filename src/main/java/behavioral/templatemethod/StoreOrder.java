package behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        log.info("ring out items from cart");
    }

    @Override
    public void doPayment() {
        log.info("process payment with card present");
    }

    @Override
    public void doReceipt() {
        log.info("print receipt");
    }

    @Override
    public void doDelivery() {
        log.info("bag items at counter");
    }
}
