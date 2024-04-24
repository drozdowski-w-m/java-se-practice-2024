package pl.globallogic.exercises.ex46;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, Double initTransaction){
        this.name = name;
        this.transactions = new ArrayList<>(Arrays.asList(initTransaction));
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(Double transaction){
        transactions.add(transaction);
    }
}
