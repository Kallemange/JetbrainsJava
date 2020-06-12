import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String outString = "";
        char[] in = scanner.next().toCharArray();

        for(int i=0; i<3; i++){
//            System.out.println(in[2-i]);
            outString += in[2-i];
        }
        System.out.println(Integer.parseInt(outString));
        // put your code here
    }
}