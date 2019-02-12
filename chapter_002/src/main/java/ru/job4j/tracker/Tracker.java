package ru.job4j.tracker;

import java.util.*;

public class Tracker{
    private final Item[] items = new Item[100];
    private int position = 0;
    private static final Random RN = new Random();

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    protected Item findeById(String id) {
        Item result = null;
        for(Item item : items) {
            if(item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    public Item[] getAll() {
        Item[] result = new Item[this.position];
        for(int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }
}
