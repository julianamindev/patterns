package behavioral.visitor.visitorgood;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AtvPartsDisplayVisitor implements AtvPartVisitor {
    @Override
    public void visit(Wheel wheel) {
        log.info("Wheel");
    }

    @Override
    public void visit(Fender fender) {
        log.info("Fender");
    }

    @Override
    public void visit(Oil oil) {
        log.info("Oil");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        log.info("We have the order");
    }
}
