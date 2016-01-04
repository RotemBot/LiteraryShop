package entities;

import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.Date;

public class Customer {

    protected int id;
    protected String name;
    protected String address;
    protected Date birthDate; // age
    protected String phoneNumber;
    protected String email;
    protected ArrayList<Periodical> subscriptions = new ArrayList<>();
    protected Gender gender;
    protected ShoppingCart shoppingCart;
    protected String password;

    /**
     * Default constructor
     */
    public Customer() {
        id = 0;
        name = null;
        address = null;
        birthDate = new Date();
        phoneNumber = null;
        email = null;
        gender = Gender.MALE;
        shoppingCart = new ShoppingCart(this);
        password = "1234";
    }

    /**
     * Constructor
     * @param name customer's name
     * @param address customer's address
     * @param birthDate customer's address to gather age
     * @param email customer's email
     * @param gender customer's gender
     */
    public Customer(String name, String address, Date birthDate, String email, Gender gender, String password) {
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.email = email;
        this.gender = gender;
        shoppingCart = new ShoppingCart(this);

        this.username = username;
        this.password = password;
    }



    /*Setters and Getters*/
    public int getId() {
        return id;
    }
    public void setId(int myId) {
        this.id = myId;
    }

    public String getName () {
        return name;
    }
    public void setName(String myName) {
        this.name = myName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String myAddress) {
        this.address = myAddress;
    }

    public Date getBirthDate () {
        return birthDate;
    }
    public void setBirthDate (Date myBirthDate) {
        this.birthDate = myBirthDate;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }
    public void setPhoneNumber (String myPhoneNumber) {
        this.phoneNumber = myPhoneNumber;
    }

    public String getEmail () {
        return email;
    }
    public void setEmail (String myEmail) {
        this.email = myEmail;
    }

    public String getUsername () { return username;}


    public String getPassword() {
        return password;
    }
}
