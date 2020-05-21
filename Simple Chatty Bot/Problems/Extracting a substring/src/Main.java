import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        Integer startVal = scanner.nextInt();
        Integer endVal = scanner.nextInt();
        System.out.println(value.substring(startVal, endVal+1));
    }
}