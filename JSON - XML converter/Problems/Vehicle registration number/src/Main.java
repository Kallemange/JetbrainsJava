import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number

        System.out.println(regNum.matches("[ABEKMHOPCTYX]\\d\\d\\d[ABEKMHOPCTYX][ABEKMHOPCTYX]"));
    }
}