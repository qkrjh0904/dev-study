package user;

import bevarage.Item;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Item> items = new ArrayList<>();

    public void put(Item item) {
        this.items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
