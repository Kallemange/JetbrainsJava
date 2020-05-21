import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int charAsNum = reader.read();
            String output = "";
            while (charAsNum != -1) {
                char input = (char) charAsNum;
                output += "" + input;
                charAsNum = reader.read();
            }/*
            if (output.isEmpty()){
                System.out.println(0);
                return;
            }*/
            output = output.trim();
            String[] x = output.split("\\s+");
            if (x.length <= 1 && x[0].isEmpty()){
                System.out.println(0);
                return;
            }
            System.out.println(x.length);
        }
    }

}