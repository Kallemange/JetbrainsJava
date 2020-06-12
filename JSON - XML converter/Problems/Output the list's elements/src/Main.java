import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        for (int i=0; i<nameList.size(); i++)
             {
            System.out.println(nameList.get(i));
        }
    }
}