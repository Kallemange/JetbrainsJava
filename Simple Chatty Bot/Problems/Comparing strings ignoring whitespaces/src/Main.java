import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");
        System.out.println(s1.equals(s2));
    }
}