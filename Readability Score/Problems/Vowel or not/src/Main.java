import java.util.Scanner;
import java.lang.*;

public class Main {

    public static boolean isVowel(char ch) {
        String CH = ""+Character.toUpperCase(ch);
        if (CH.matches("[AEIOU]")){
            return true;
        }
        else {
            return false;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}