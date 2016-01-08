package model.backend;

import entities.WrittenWork;
import entities.Customer;
import entities.Provider;
import entities.Purchase;

public interface Backend {

    //add
    public void addBook(WrittenWork book) throws Exception;
    public void addCustomer(Customer customer) throws Exception;
    public void addProvider(Provider provider)throws Exception;

    //delete
    public void deleteBook(int bookID) throws Exception;
    public void deleteCustomer(int customerID) throws Exception;
    public void deleteProvider(int providerID) throws Exception;

    //update
    public void updateShoppingCart() throws Exception;
    public void updateProduct(Purchase purchase) throws Exception;

   // public ArrayList<Shop> getShopByProductID (long productID) throws Exception;

}
