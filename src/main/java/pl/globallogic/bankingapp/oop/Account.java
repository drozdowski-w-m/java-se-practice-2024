package pl.globallogic.bankingapp.oop;

public class Account {
    private String id, holderName;
    private double balance;
    private boolean isActive;

    public Account(String id, String holderName, double balance, boolean status){
        this.id = id;
        this.balance = balance;
        this.holderName = holderName;
        this.isActive = status;
    }
    public Account(){

    }

    public Account(String id, String holderName, double balance) {
        this(id, holderName, balance, true);
    }
    public void deposit(double amount){
        if ( amount > 0 ){
            this.balance += amount;
        } else {
            System.out.println("Entered amount is less than 0");
            return;
        }
    }

    public void withdraw(double amount){
        if (amount < 0 || amount > this.balance) {
            System.out.println("Operation cannot be completed.");
            return;
        }
        this.balance -= amount;
    }

    public void transfer(double amount, Account toAccount){

        this.withdraw(amount);
        toAccount.deposit(amount);
    }



    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                ", isActive=" + isActive +
                '}';
    }
}
