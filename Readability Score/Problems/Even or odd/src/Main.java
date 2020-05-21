import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n!=0){
            if (n%2==0){
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }
            n=s.nextInt();
        }
    }
}