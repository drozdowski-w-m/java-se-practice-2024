package pl.globallogic.bankingapp.oop;

import java.util.ArrayList;
import java.util.UUID;

public class AccountService {

    ArrayList<Account> accountsRepo = new ArrayList<Account>();
    public Account createAccount(double amount, String holderName){
        String accountId = UUID.randomUUID().toString();
        boolean defaultIsActiveStatus = true;
        Account acc = new Account(accountId, holderName, amount, defaultIsActiveStatus);

        accountsRepo.add(acc);
        return acc;
    }


}
