package behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WebOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        log.info("get items from cart");
        log.info("set gift preferences");
        log.info("set delivery address");
        log.info("set billing address");
    }

    @Override
    public void doPayment() {
        log.info("process payment without card present");
    }

    @Override
    public void doReceipt() {
        log.info("email receipt");
    }

    @Override
    public void doDelivery() {
        log.info("ship the item to address");
    }
}
