package org.supermarket;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int itemCount;

    public void add(String itemName) {
        itemCount++;
    }

    public int getTotalNumberOfItems() {
        return itemCount;
    }

    public List<Item> getItems() {
        return new ArrayList<Item>();
    }
}
