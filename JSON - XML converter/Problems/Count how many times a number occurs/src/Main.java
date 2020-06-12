import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] numbers = new int[size];
        for(int i = 0; i<size;i++){
            numbers[i] = s.nextInt();
        }
        int n = s.nextInt();
        int counter = 0;
        for(int i = 0; i<size;i++){
            if(numbers[i] == n){
                counter++;
            }
        }
        System.out.println(counter);
    }
}