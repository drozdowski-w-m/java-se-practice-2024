package pl.globallogic.exercises.ex46;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public Branch findBranch(String branchName){
        for (Branch branch : branches){
            if ( branch.getName().equals(branchName) )
                return branch;
        }
        return null;
    }

    public boolean addBranch(String name){
        if ( findBranch(name) == null ) {
            branches.add(new Branch(name));
            return true;
        }
        else {
            System.out.println("This branch already exists!");
            return false;
        }

    }

    public boolean addCustomer(String branchName, String custName, Double initTrans){
        Branch branch = findBranch(branchName);
        if ( branch != null ){
            branch.newCustomer(custName, initTrans);
            return true;
        } else {
            System.out.println("This branch doesn\'t exist!");
            return false;
        }
    }

    public boolean addCustomerTransaction(String branchName, String custName, Double transaction){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            Customer customer = branch.findCustomer(custName);
            customer.addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);
        if (branch == null) {
            return false;
        } else {

            ArrayList<Customer> customers = branch.getCustomers();

            System.out.println("Customer details for branch "+branchName);

            for ( Customer customer : customers ){
                if (printTransactions) {
                    ArrayList<Double> transactions = customer.getTransactions();
                    System.out.println("Customer: "+customer.getName()+"["+(customers.indexOf(customer)+1)+"]");
                    for (Double transaction : transactions){
                        System.out.println("["+(transactions.indexOf(transaction)+1)+"]"+"Amount: "+transaction);
                    }
                } else
                    System.out.println(customer.getName());
            }
            return true;
        }
    }
}
