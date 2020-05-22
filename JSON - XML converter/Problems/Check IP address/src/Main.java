import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String out;
        String ip = s.next();
        String[] ipSplit = ip.split("\\.");

        out = ip.matches("\\d+\\.\\d+\\.\\d+\\.\\d+") ? "YES" : "NO";
        for (var val: ipSplit) {
            try {
                if (Integer.parseInt(val) > 255) {
                    System.out.println("NO");
                    return;
                }
            }
            catch (Exception e){
            }
        }
        System.out.println(out);
    }
}