package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String itemName = "apples";
        double itemPrice = 1.99;
        int itemQuantity = 5;

        System.out.println("You bought " + itemQuantity + " " + itemName + " for $" + itemPrice + ".");
    }
}
