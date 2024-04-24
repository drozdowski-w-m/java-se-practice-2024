package pl.globallogic.bankingapp.oop;

public class BankingApplicationRunner {
    public static void main(String[] args) {
        Account testAccount = new Account("1111","TestMan",400);
        Account anotherTestAccount = new Account("2222", "TestWoman", 300);

        testAccount.transfer(300, anotherTestAccount);
        System.out.println(testAccount);

    }
}
