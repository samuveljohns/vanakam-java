package ATMMachine;

import java.util.LinkedList;
import java.util.List;

public class BankDatabase {
    List<Account> accounts = new LinkedList<>();
   BankDatabase(){
    Account acc1 = new Account(0001, 1111, 10000, "user");
    Account acc2 = new Account(0001, 1111, 10000, "user");
    Account acc3 = new Account(0001, 1111, 10000, "user");
    Account acc4 = new Account(0001, 1111, 10000, "manager");
    accounts.add(acc1);
    accounts.add(acc2);
    accounts.add(acc3);
    accounts.add(acc4);
   }

   boolean validatePin(int pin){
    for(Account account:accounts){
        if(account.pin == pin){
            return true;
        }
    }
    return false;
   }

   Account getAccount(int pin){
    for(Account account:accounts){
        if(account.pin == pin){
            return account;
        }
    }
    return null;
   }
}
