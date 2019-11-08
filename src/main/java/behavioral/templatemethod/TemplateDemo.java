package behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TemplateDemo {
    public static void main(String[] args) {
        log.info("Web Order:");
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();

        log.info("Store Order:");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
