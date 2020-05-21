import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int K = s.nextInt();

        if (K>N*M) {
            System.out.println("NO");
        }
        else if (K%N ==0||K%M==0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}