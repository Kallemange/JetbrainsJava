import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        int value;
        for (int i=0;i<n;i++){
            value = s.nextInt();
            if (value==0) {
                perfect +=1;
            }
            else if (value == -1) {
                smaller +=1;
            }
            else if (value == 1) {
                larger +=1;
            }

        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}