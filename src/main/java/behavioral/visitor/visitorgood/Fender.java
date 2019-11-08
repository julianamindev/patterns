package behavioral.visitor.visitorgood;

import behavioral.visitor.visitorgood.AtvPart;

public class Fender implements AtvPart {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
