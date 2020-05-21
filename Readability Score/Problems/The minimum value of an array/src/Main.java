import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int minVal = Integer.MAX_VALUE;
        int val;
        for (int i =0; i<n;i++){
            val = s.nextInt();
            if (val<minVal) {
                minVal = val;
            }
        }
        System.out.println(minVal);
    }
}