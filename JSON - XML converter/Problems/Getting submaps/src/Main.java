import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] limits = s.nextLine().split(" ");
        int lower = Integer.parseInt(limits[0]);
        int upper = Integer.parseInt(limits[1]);
        int N = Integer.parseInt(s.nextLine().strip());
        SortedMap<Integer, String> map = new TreeMap<>();
        String input[];
        for (int i = 0; i < N; i++) {
            input = s.nextLine().strip().split(" ");
            map.put(Integer.parseInt(input[0]), input[1]);
        }
        map = map.subMap(lower, upper + 1);
        for (var value : map.entrySet()) {
            System.out.println(value.getKey() + " " + value.getValue());
        }
    }
    // put your code here
}