import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double d = Math.pow(b,2) - 4*a*c;

        double root1 = (-b + Math.sqrt(d))/(2*a);
        double root2 = (-b - Math.sqrt(d))/(2*a);
        if (root1<root2){
            System.out.println(root1 + " " + root2);
        }
        else if (root1 == root2){
            System.out.println(root2);
        }
        else {
            System.out.println(root2 + " " + root1);
        }
    }
}