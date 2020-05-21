import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();

        if ((A<=H)&&(H<=B)) {
            System.out.println("Normal");
        }
        else {

            if (H<A) {
                System.out.println("Deficiency");
                }
            else if (H > B) {
                    System.out.println("Excess");
                }
            }
    }
}