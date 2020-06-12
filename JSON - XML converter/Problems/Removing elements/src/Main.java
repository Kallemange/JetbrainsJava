import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        String[] strList = str.split("\\s");
        HashSet<Integer> set = new HashSet<>();
        for (var val: strList) {
            set.add(Integer.parseInt(val));
        }
        //Set<Integer> set2 = set;
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(s -> s > 10);
    }

}
/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}
