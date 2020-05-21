import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldStr = scanner.next();
        String newStr = oldStr.replace('a','b');
        System.out.println(newStr);
    }
}