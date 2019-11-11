package behavioral.visitor.example1;

public class PriceVisitor implements Visitor {

    private double total = 0;

    @Override
    public void visitBook(BookItem book) {
        total += book.getPrice();
    }

    @Override
    public void visitDvd(DvdItem dvd) {
        total += dvd.getPrice() * 0.3;
    }

    public double getTotal() {
        return total;
    }
}
