import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {

            Reader reader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(reader);
            int[] line = new int[50];
            int i;
            int idx = 0;
            while ((i = br.read()) != -1) {
                line[idx++] = i;
            }
            br.close();
            reader.close();
            String reversed = "";
            for (int k = 0; k < idx; k++) {
                reversed += (char) line[k];
            }
            reversed = reversed.trim();
            StringBuilder x = new StringBuilder();
            x.append(reversed);
            System.out.println(x.reverse());

    }
}
