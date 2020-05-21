import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();

        int numPos = (i>0 ? 1:0)+(j>0 ? 1:0) + (k>0 ? 1:0);
        System.out.println(numPos == 1);
    }
}