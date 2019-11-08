package behavioral.visitor.visitorgood;

// Element Interface
// Oil, Wheel, and Fender are the concrete elements
public interface AtvPart {
    void accept(AtvPartVisitor visitor);
}
