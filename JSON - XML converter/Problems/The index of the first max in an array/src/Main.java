import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int X;
        int max = Integer.MIN_VALUE;
        int idx = 0;
        for(int i = 0; i<x; i++){
            X = s.nextInt();
            if(X>max){
                idx = i;
                max = X;
            }
        }
        System.out.println(idx);
    }
}