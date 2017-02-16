package com.theironyard.novauc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by JacobP on 2/15/17.
 */
public class Electronics extends InventoryItem {


    public Electronics(String name, int quantity) {
        super(name, quantity);

        this.category = "Electronics";
    }


    public void main(String[] args) {


        ArrayList<InventoryItem> items = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1. Create item");
            System.out.println("2. List items");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Enter your item: ");
                String name = scanner.nextLine();
                InventoryItem.createitem("item", 2,"Electronics");
                items.add();


                // prompt for information needed to create new item
                // use createItem method to create a new item based on category user entered
                // add new item to arraylist

 //               InventoryItem item = new InventoryItem(text, false);
//              we call the InventoryItem class so we can add new item to ArrayList
 //               items.add(item);

            } else if (option.equals("2")) {
                int i = 1;
                for (InventoryItem item : items) {
                    //           item is the particular item being worked on. items is the variable for the entire list of items.

                    String checkbox = "[] ";
                    if (item.isDone) {
                        checkbox = "[x] ";
                    }
                    System.out.printf("%S %S. %S\n", checkbox, i, item.text);
                    i++;
                }
            } else {
                System.out.println("Invalid Option");


            }
        }
    }
}


