import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        String y = s.next();
        String Y = "";
        while (!"0".equals(y)){
            Y += y + " ";
            y = s.next();
            //System.out.println(Y);
        }

        String[] z = Y.split("\\s");

        for (int i = 0; i < z.length; i++){
            try {
                x = Integer.parseInt(z[i]);
                System.out.println(x*10);
            }
            catch (Exception e){
                System.out.println("Invalid user input: " + z[i]);
            }
        }
    }
}