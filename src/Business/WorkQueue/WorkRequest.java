/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Customer.Product;
import Business.Employee.Employee;
import Business.Organisation.Grocery.GroceryProduct;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author mansi
 */
public class WorkRequest {
    
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private Product product;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Customer cust;
    private GroceryProduct groceryProduct;

    
    
    

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }
    
    
    
    public WorkRequest(){
        requestDate = new Date();
    }
    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public GroceryProduct getGroceryProduct() {
        return groceryProduct;
    }

    public void setGroceryProduct(GroceryProduct groceryProduct) {
        this.groceryProduct = groceryProduct;
    }
    
    
    

    
}
