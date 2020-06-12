import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner     = new Scanner(System.in);
        int cups            = scanner.nextInt();
        boolean isWeekend   = scanner.nextBoolean();
        if(cups >= 15 && 25 >= cups && isWeekend){
            System.out.println(true);
        }
        else if(cups >= 10 && 20 >= cups && !isWeekend){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}