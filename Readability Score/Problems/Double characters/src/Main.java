import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        String z = "";
        for (int i=0; i<x.length();i++){
            z += x.charAt(i);
            z += x.charAt(i);

        }
        System.out.println(z);
    }
}