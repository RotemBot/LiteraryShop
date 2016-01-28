package model.backend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Book;
import entities.WrittenWork;
import entities.Customer;
import entities.Provider;
import entities.Periodical;
import entities.Purchase;

public interface Backend {

    //add
   // public void addBook(WrittenWork book) throws Exception;
  //  public void addCustomer(Customer customer) throws Exception;
   // public void addProvider(Provider provider)throws Exception;

    //delete
   // public void deleteBook(int bookID) throws Exception;
   // public void deleteCustomer(int customerID) throws Exception;
   // public void deleteProvider(int providerID) throws Exception;

    //update
    //public void updateShoppingCart() throws Exception;
    //public void updateProduct(Purchase purchase) throws Exception;

   // public ArrayList<Shop> getShopByProductID (long productID) throws Exception;


    public void addBook(Book book)throws  Exception;
    public void addPeriodical (Periodical periodical)throws Exception;
    public void addProvider(Provider provider)throws  Exception;
    public void addCustomer(Customer customer)throws  Exception;
    public long addOrder(Order order)throws Exception;

    public void deleteBook(long bookId)throws Exception;
    public void deleteProvider(long providerId)throws Exception;
    public void deleteCustomer(long CustomerId) throws Exception;
    public void deleteOrder(long orderId)throws Exception;


    public void updateBook(Book book)throws  Exception;
    public void updateProvider(Provider provider)throws  Exception;
    public void updateCustomer(Customer customer)throws  Exception;

    public ArrayList<Book> getBooksList()throws Exception;
    public ArrayList<Provider> getProvidersList()throws Exception;
    public ArrayList<Customer> getCustomersList()throws Exception;

  //  public Book findBookById(long bookId)throws Exception;
  //  public Provider findProviderById(long providerId)throws Exception;
  //  public Customer findClientById(long customerId)throws Exception;
  //  public Order findOrderById(long OrderId)throws Exception;



}
