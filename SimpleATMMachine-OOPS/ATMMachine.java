package ATMMachine;

import java.util.Scanner;

class ATMMachine {
    public static void main(String args[]){
        BankDatabase db = new BankDatabase();
        

        System.out.println("Welcome to SRI ESWAR BANK ATM");
        System.out.println("We assume the ATM card is inserted and validated");

        System.out.println("Please enter the pin");

        Scanner scanner = new Scanner(System.in);
        int pin = scanner.nextInt();

        boolean pinValidated = db.validatePin(pin);

        if(pinValidated){
            System.out.println("Pls choose available option");
            System.out.println("1. Withdrawl");
            System.out.println("2. Check balance");
            int option = scanner.nextInt();
            Account acc = db.getAccount(pin);
            switch(option){
                case 1:
                System.out.println("Please enter amount");
                int amount = scanner.nextInt();
                acc.withDraw(amount);  
                System.out.println("Pls choose available option after withdrawl"+acc.getBalance());    
                break;
                case 2:
                System.out.println("Available balance"+acc.getBalance());    

            }


            
        }
        else{
            System.out.println("Ivalid pin");
        }
        scanner.close();

    }
}
