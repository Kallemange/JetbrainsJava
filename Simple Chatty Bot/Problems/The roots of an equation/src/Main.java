import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        for (int i=0;i<1000;i++){
            if ((a*Math.pow(i,3)+b*Math.pow(i,2)+c*i+d) ==0){
                System.out.println(i);
            }

        }
    }
}