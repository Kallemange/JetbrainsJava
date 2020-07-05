package banking;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);
    public static Map<String, BankAccount> accounts = new HashMap<>();
    public static void main(String[] args) {
        BankAccount account;
        int option;
        while (1 == 1){
            option = showMenu();
            switch (option){
                case 1:
                    account = new BankAccount();
                    account.printAccountInfo();
                    accounts.put(account.getCardNr(), account);
                    break;
                case 2:
                    logInMenu();
                    account = null;
                    break;
                case 0:
                    System.out.println("Bye!");
                    return;
            }


        }

    }

    public static void logInMenu(){
        System.out.println("Enter your card number:");
        String cardNr = s.next().strip();
        System.out.println("Enter your PIN:");
        String PIN = s.next().strip();
        BankAccount account = accounts.get(cardNr);
        if(account == null || !(PIN.equals(account.getPIN()))){
            System.out.println("Wrong card number or PIN!");
        }
        else{
            account.showMenu();
            account = null;
        }

    }
    private static int showMenu(){
        System.out.println("1. Create an account");
        System.out.println("2. Log into an account");
        System.out.println("0. Exit");
        Integer chosenVal = null;
        String input;
        do{
            try{
                input = s.next();
                chosenVal = Integer.parseInt(input);
                if(!(chosenVal == 0 || chosenVal == 1 || chosenVal == 2)){
                    chosenVal = null;
                    throw new IOException();
                }
            }
            catch (Exception e){
                System.out.println("Enter valid nr");
            }
        }while (chosenVal == null);
        return chosenVal;
    }
}

