package pl.globallogic.exercises.ex46;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer findCustomer(String name){
        for (Customer customer : customers){
            if (customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }

    public boolean newCustomer(String custName, Double initTrans){
        if ( findCustomer(custName) == null ){
            customers.add(new Customer(custName, initTrans));
            return true;
        } else
            return false;
    }

    public boolean addCustomerTransaction(String custName, Double transaction){
        Customer customer = findCustomer(custName);
        if ( customer == null )
            return false;
        else {
            customer.addTransaction(transaction);
            return true;
        }
    }

}
