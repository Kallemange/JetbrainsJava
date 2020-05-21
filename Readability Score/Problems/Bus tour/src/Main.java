import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bus = s.nextInt();
        int noBridges = s.nextInt();
        int bridge;
        for (int i=0;i<noBridges;i++){
             bridge = s.nextInt();
             if (bus>=bridge) {
                 System.out.println("Will crash on bridge "+ (i+1));
                 return;
             }
        }
        System.out.println("Will not crash");

    }
}