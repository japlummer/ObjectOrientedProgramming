package com.theironyard.novauc;

/**
 * Created by JacobP on 2/15/17.
 */
public class Grocery extends InventoryItem {

    public Grocery(String name, int quantity){
        super(name, quantity);

        this.category = "Grocery";

    }
}
