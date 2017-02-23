package com.theironyard.novauc;

/**
 * Created by JacobP on 2/15/17.
 */
public class LawnandGarden extends InventoryItem {

    public LawnandGarden(String item, int quantity, String category){
        this.name = item;
        this.quantity = quantity;
        this.category = "LawnandGarden";
    }
}
