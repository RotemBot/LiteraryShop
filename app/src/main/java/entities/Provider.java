package entities; /**
 */

import java.util.*;

public class Provider {

    protected int id;
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;
    protected String password;
    private float rating;
    private int experienceYears;

    private ArrayList<WrittenWork> products = new ArrayList<>();

    /**
     * Default constructor
     */
    public Provider() {
        super();
        rating = 0;
        experienceYears = 0;
        id = -1;
    }

    /**
     * Constructor
     * @param name customer's name
     * @param address customer's address
     * @param email customer's email
     */
    public Provider(String name, String address, String email, String password)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
        this.rating = 0;
        this.experienceYears = 0;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getName() { return name;}

    @Override
    public String toString() {
        return getName();
    }

    public void addProduct(WrittenWork product) {
        products.add(product);
    }

    public void removeProduct(int productId) {

    }
    public ArrayList<WrittenWork> getProducts() { return products; }

    public int getNumOfProducts() {
        return products.size();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

}
