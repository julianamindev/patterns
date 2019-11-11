package behavioral.visitor.example1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static final List<Visitable> items = new ArrayList<>();

    public static void main(String[] args) {
        items.add(new BookItem());
        items.add(new DvdItem());

        PriceVisitor priceVisitor = new PriceVisitor();

        for (Visitable item : items) {
            item.accept(priceVisitor);
        }

        System.out.printf("Total price is %.2f", priceVisitor.getTotal());
    }
}
