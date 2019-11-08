package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Catalog acts as a Factory and cache for Item flyweight objects
public class Catalog {
    private Map<String, Item> items = new HashMap<>();

    // factory method
    public Item lookUp(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}
