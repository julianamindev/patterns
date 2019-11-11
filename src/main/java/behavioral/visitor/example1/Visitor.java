package behavioral.visitor.example1;

public interface Visitor {
    void visitBook(BookItem book);
    void visitDvd(DvdItem dvd);
}
