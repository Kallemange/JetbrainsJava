import java.util.Scanner;
import java.math.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        System.out.println(Math.PI*radius*radius);
    }
}