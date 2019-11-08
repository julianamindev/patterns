package behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class OrderTemplate {

    public boolean isGift;

    public abstract void doCheckout();

    public abstract void doPayment();

    public abstract void doReceipt();

    public abstract void doDelivery();

    public final void wrapGift() {
        log.info("Gift wrapped.");
    }

    public final void processOrder() {
        doCheckout();
        doPayment();

        if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }

        doDelivery();
    }
}
