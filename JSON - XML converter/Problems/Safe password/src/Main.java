import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean lowerCase;
        boolean upperCase;
        boolean digit;
        boolean longerThan12;
        String pass;
        try {
            pass = s.next();
        }
        catch (Exception e){
            pass = "";
        }
        String out;
        if (pass.isBlank()){
            System.out.println("NO");
            return;
        }
        lowerCase = pass.matches(".*[a-z].*") ? true : false;
        upperCase = pass.matches(".*[A-Z].*") ? true : false;
        digit = pass.matches(".*\\d.*") ? true : false;
        longerThan12 = (pass.length() > 11);
        out = (lowerCase && upperCase && digit && longerThan12) ? "YES" : "NO";
        System.out.println(out);
    }
}