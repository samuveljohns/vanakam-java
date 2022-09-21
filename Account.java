package ATMMachine;

public class Account {
    int accountNumber;
    int pin;
    int balance;
    String userType;
    Account(int accountNumber, int pin, int balance, String userType){
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance=balance;
        this.userType = userType;
    }
    void withDraw(int amount){
        balance -=amount;
    }
    int getBalance(){
        return balance;
    }
}
