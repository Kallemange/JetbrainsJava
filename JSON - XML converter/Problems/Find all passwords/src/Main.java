import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("(password\\s*:?\\s*)([\\w\\d]+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        String defaultStr = "No passwords found.";
        while ( matcher.find() ){
            System.out.println(matcher.group(2));
            defaultStr = null;
        }
        if ( defaultStr != null ){
            System.out.println(defaultStr);
        }
        // write your code here
    }
}
