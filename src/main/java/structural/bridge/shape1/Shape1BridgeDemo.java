package structural.bridge.shape1;

// using inheritance, we will still need to create a class per combination
// of shape and color
public class Shape1BridgeDemo {
    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();

        circle.applyColor();
        square.applyColor();
    }
}
