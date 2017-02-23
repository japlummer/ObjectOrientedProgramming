package com.theironyard.novauc;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<InventoryItem> items = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1. Create item");
            System.out.println("2. List items");

            String option = scanner.nextLine();


            if (option.equals("1")) {
                System.out.println("Enter your item name: ");
                String item = scanner.nextLine();
                System.out.println("Enter quantity: ");
                int quantity = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter category: ");
                String category = scanner.nextLine();

//                items.add(new InventoryItem(item, quantity, category));
                items.add(createItem(item, quantity, category));


                // prompt for information needed to create new item
                // use createItem method to create a new item based on category user entered
                // add new item to arraylist

                //               InventoryItem item = new InventoryItem(text, false);
//              we call the InventoryItem class so we can add new item to ArrayList
                //               items.add(item);

            } else if (option.equals("2")) {
                int i = 1;

                for (InventoryItem materials : items) {
                    //           item is the particular item being worked on. items is the variable for the entire list of items.
                    System.out.printf("%s %s %s\n", materials.name, materials.quantity, materials.category);

                }
            } else
                {
                System.out.println("Invalid Option");


                // this method should create new items of the five different classes based on what the user inputs for category

            }


        }
    }

    public static InventoryItem createItem(String item, int quantity, String category) throws Exception {

        if (category.equalsIgnoreCase("Electronics")) {
            return new Electronics(item, quantity, category);
        } else if (category.equalsIgnoreCase("Clothing")) {
            return new Clothing(item, quantity, category);
        } else if (category.equalsIgnoreCase("Sports")) {
            return new Sports(item, quantity, category);
        } else if (category.equalsIgnoreCase("LawnandGarden")) {
            return new LawnandGarden(item, quantity, category);
        } else if (category.equalsIgnoreCase("Grocery")) {
            return new Grocery(item, quantity, category);
        } else {
            throw new Exception("Invalid category name");
        }
    }
}



