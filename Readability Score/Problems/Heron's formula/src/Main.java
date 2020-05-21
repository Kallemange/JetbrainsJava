import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        double p = ((double) a + b + c)/2;
        double Area = p*(p-a)*(p-b)*(p-c);
        double S = Math.sqrt(Area);
        System.out.println(S);
    }
}