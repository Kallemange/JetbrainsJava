import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        long value = a;
        for (int i = a+1; i<b;i++){
            value*=i;
        }
        System.out.println(value);
    }
}