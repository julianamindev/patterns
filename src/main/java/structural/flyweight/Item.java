package structural.flyweight;

// instances of Item will be the Flyweights
public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
