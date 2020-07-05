package banking;

import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    String cardNr;
    long balance;
    String PIN;

    public BankAccount(){
        this.cardNr = createAccountNr();
        this.PIN = createPIN();
    }

    public String getCardNr(){
        return this.cardNr;
    }

    private String createAccountNr(){
        Random randomVal = new Random();
        String act = "400000";
        for (int i = 0; i < 10; i++) {
            act += "" + randomVal.nextInt(10);
        }
        act += checkSum();
        return act;
    }

    private String checkSum(){
        return "0";
    }
    private String createPIN(){
        Random randomVal = new Random();
        String PIN = "";
        for (int i = 0; i < 4; i++) {
            PIN += "" + randomVal.nextInt(10);
        }
        return PIN;
    }
    public String getPIN(){
        return this.PIN;
    }

    public void showMenu(){
        System.out.println("You have successfully logged in!");
        String input;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("1. Balance");
            System.out.println("2. Log out");
            System.out.println("0. Exit");
            input = s.nextLine();
            switch (input){
                case "1":
                    System.out.println("Balance: " + getBalance());
                    break;
                case "2":
                    System.out.println("You have successfully logged out!");
                    return;
                case "0":
                    System.exit(0);

            }
        } while (input != "0");

    }


    private long getBalance(){
        return this.balance;
    }
    public void printAccountInfo(){
        System.out.println("Your card number:");
        System.out.println(getCardNr());
        System.out.println("Your card PIN:");
        System.out.println(getPIN());
    }

}
