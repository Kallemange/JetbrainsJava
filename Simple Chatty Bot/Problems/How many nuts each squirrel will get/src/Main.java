import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer squirrels = scanner.nextInt();
        Integer nuts = scanner.nextInt();
        System.out.println(nuts/squirrels);
    }
}