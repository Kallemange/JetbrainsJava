import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        int y = s.nextInt();
        while (y!=0){
            x += y;
            y = s.nextInt();
        }
        System.out.println(x);
    }

}
