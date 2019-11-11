package behavioral.visitor.example1;

public class BookItem implements Visitable {

    private double price = 45.0;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }

    public double getPrice() {
        return price;
    }
}
