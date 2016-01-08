/**
 * Created by Rotem on 10/11/2015.
 *
 * A class which dictates the basic fields
 * every product which is sold in our store, should hold
 */
package entities;
import java.util.*;

public abstract class WrittenWork {

    /**
     * A unique identifier for every written work.
     * Six numbers and/or letters.
     */
    protected int id;

    protected String title;

    protected double price;

    protected String description;

    protected ArrayList<Provider> sellers = new ArrayList<>();

    protected Genre genre;

    protected WrittenWork(String title, double price, String description, Genre genre) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Removes a specified seller from the written work's seller list.
     * Also removes the product from the seller's product list.
     * @param toRemove The seller to remove
     * @return true if the seller was found and removed, false otherwise.
     */
    public boolean removeSeller(Provider toRemove) {
        for (Provider seller : sellers) {
            if (seller.getId() == toRemove.getId()) {
                toRemove.removeProduct(this.id);
                return sellers.remove(seller);
            }
        }
        return false;
    }

    /**
     * Adds a new seller to the written work's seller list.
     * Only if the seller doesn't already exist in the sellers list.
     * @param toAdd The new seller to add.
     * @return True if the new seller was added, false otherwise.
     */
    public boolean addSeller(Provider toAdd) {
        if (!sellers.contains(toAdd)) {
            toAdd.addProduct(this);
            return sellers.add(toAdd);
        }
        return false;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() { return id; }

    public ArrayList<Provider> getSellers() {
        return sellers;
    }
}


