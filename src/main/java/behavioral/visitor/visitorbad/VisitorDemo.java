package behavioral.visitor.visitorbad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VisitorDemo {
    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        double shippingCost = order.calculateShipping();

        log.info("{}", shippingCost);
    }
}
