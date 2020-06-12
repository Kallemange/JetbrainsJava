import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringWithHTMLTags = scanner.nextLine();
        String regex = "<([^<>])*>";
        String result = stringWithHTMLTags.replaceAll(regex, "");
        System.out.println(result.trim());
        // write your code here
    }
}
