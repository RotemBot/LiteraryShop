package entities;

import java.util.ArrayList;


public class ShoppingCart {


    private ArrayList<Purchase> purchases = new ArrayList<>();
    private Customer owner;

    public ShoppingCart(Customer owner) {
        this.owner = owner;
    }

    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
    }


}
