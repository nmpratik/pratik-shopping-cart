package com.pra.sh.item;

import java.util.*;

import com.pra.sh.exception.ItemNotFoundException;

public class ItemDb {
    private final static ArrayList<Item> items = new ArrayList<>();

    public static void addItem(int id, String name, double price) {
        Item item = new Item(id, name, price);
        items.add(item);
    }

    public static List<Item> listItems() {
        return items;
    }

    public static Item findItemById(int itemId) {

        for( Item item : items) {
            if(item.getId() == itemId) {
                return item;
            }
        }

        throw new ItemNotFoundException("❌ Item Id " + itemId  +" Not Found");
    }
}
