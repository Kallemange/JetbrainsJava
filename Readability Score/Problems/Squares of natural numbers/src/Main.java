import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while  (i*i<=N){
            System.out.println(i*i);
            i++;

        }
    }
}