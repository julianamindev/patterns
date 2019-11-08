package structural.bridge.shape2;

// in this version, the Color and Shape are separated and now,
// Color is referenced inside the Shape class (Composition).
// So whenever, there is a new Shape or new Color to be introduced,
// there is no need to create a separate class for that specific
// combination
public class Shape2BridgeDemo {
    public static void main(String[] args) {
        Color blue = new Blue();

        Shape square = new Square(blue);

        Color red = new Red();

        Shape circle = new Circle(red);

        square.applyColor();
        circle.applyColor();
    }
}
