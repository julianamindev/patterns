package behavioral.visitor.visitorgood;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 15;
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount += 3;
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 9;
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        List<AtvPart> parts = partsOrder.getParts();
        if (parts.size() > 3) {
            shippingAmount -= 5;
        }
        log.info("Shipping amount is: {}", shippingAmount);
    }
}
