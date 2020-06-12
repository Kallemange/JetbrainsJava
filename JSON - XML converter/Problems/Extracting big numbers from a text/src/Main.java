import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringWithNumbers = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d{10}\\d*");
        Matcher matcher = pattern.matcher(stringWithNumbers);
        int len;
        while (matcher.find()){
            len = matcher.end()-matcher.start();
            System.out.println(matcher.group() + ":" + len);
        }

        // write your code here
    }
}