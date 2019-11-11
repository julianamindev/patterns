package behavioral.visitor.example1;

public class DvdItem implements Visitable {

    private double price = 67.5;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDvd(this);
    }

    public double getPrice() {
        return price;
    }
}
