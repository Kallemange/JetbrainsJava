import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        String K = scanner.next();

        System.out.println(Integer.parseInt(K) % Integer.parseInt(N));
    }
}