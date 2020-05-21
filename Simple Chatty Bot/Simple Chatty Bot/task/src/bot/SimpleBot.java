package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String myName = scanner.next();

        System.out.println("What a great name you have, " + myName);
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int r3 = scanner.nextInt();
        int r5 = scanner.nextInt();
        int r7 = scanner.nextInt();

        int myAge = (r3*70+r5*21+r7*15 ) %105;
        System.out.println("Your age is "+ myAge + " that's a good time to start programming!");
    }
}
