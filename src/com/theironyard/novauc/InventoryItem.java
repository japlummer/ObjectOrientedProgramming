package com.theironyard.novauc;

import java.util.ArrayList;

/**
 * Created by JacobP on 2/15/17.
 */
public class InventoryItem {

    public String text;
    public boolean isDone;

    public InventoryItem(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;

    }

    public InventoryItem(String name, int quantity){
        this.name = name;
        this.quantity = quantity;

    }


    static void createitem(String name, int quantity, String category){
        // this method should create new items of the five different classes based on what the user inputs for category

    }


    String name;
    int quantity;
    String category;

        ArrayList<InventoryItem> items = new ArrayList<>();

}




