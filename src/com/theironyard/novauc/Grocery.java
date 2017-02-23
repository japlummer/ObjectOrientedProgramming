package com.theironyard.novauc;

/**
 * Created by JacobP on 2/15/17.
 */
public class Grocery extends InventoryItem {

    public Grocery(String item, int quantity, String category){
        this.name = item;
        this.quantity = quantity;
        this.category = "Grocery";

    }
}
