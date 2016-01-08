package entities;

/**
 * Created by nn on 18/11/2015.
 */
public class Shop {

    private long ShopID;
    private String ShopName;
    private String ShopAddress;
    private String TelephoneNumber;
    private String Email;
    private static int shopIDCounter=0;

    public Shop(long shopID, String shopName, String shopAddress, String telephoneNumber, String email) {
        ShopID = shopID;
        ShopName = shopName;
        ShopAddress = shopAddress;
        TelephoneNumber = telephoneNumber;
        Email = email;
    }

/*
    public long getShopID() {
        return ShopID;
    }

    public void setShopID(long shopID) {
        ShopID = shopID;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public String getShopAddress() {
        return ShopAddress;
    }

    public void setShopAddress(String shopAddress) {
        ShopAddress = shopAddress;
    }

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        TelephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }*/
}
