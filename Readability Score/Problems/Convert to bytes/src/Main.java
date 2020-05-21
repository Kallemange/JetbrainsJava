import javax.swing.*;
import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        int currentChar=inputStream.read();
        while (currentChar != -1){
            System.out.print(currentChar);
            currentChar = inputStream.read();
        }
    }
}