import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int n  = s.nextInt();
        if (n>str.length()){
            System.out.println(str);
        }
        else {
            System.out.print(str.substring(n));
            System.out.print(str.substring(0,n));
        }
    }
}