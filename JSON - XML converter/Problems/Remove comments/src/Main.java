import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codeWithComments = scanner.nextLine();
        //String regex = "(/\\*[^/]*\\*/)|/{2}.*([\r\n]|(\r\n)|$)";
        String regex = "(/\\*([^*]|[\r\n]|(\\*+([^*/]|[\r\n])))*\\*+/)|(/{2}.*([\\r\\n]|(\\r\\n)|$))";
        String result = codeWithComments.replaceAll(regex, "");
        System.out.println(result);
        // write your code here
    }
}