package com.theironyard.novauc;

/**
 * Created by JacobP on 2/15/17.
 */
public class Clothing extends InventoryItem {

    public Clothing(String item, int quantity, String category){
        this.name = item;
        this.quantity = quantity;
        this.category = "Clothing";
    }
}
