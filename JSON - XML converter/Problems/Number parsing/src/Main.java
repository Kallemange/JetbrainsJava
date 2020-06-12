import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] testTrue = {"123", "+1.1", "0", "-0,05", "-1,05", "-56.0", ""};
//        String[] testFalse = {"0.0", "1.", "+-1", "0123", "-23.230"};
        String regex =  "^[\\+-]?" +
                        "(" +
                            //"(0$|0[\\.,]\\d*[1-9]$)|" +
                            "(0$|0[\\.,](0$|\\d*[1-9]$))|" +
                            "([1-9]\\d*$)|" +
                            "(" +
                                "[1-9]\\d*[\\.,]" +
                                "(" +
                                    "0$|\\d*[1-9]$" +
                                ")" +
                            ")" +
                        ")";
        String number = scanner.nextLine();
        System.out.println(number.matches(regex) ? "YES" : "NO");
//        System.out.println("True tests");
//        for (var x: testTrue
//             ) {
//            System.out.println(x + "\t true :" + x.matches(regex));
//        }
//        System.out.println("False tests");
//        for ( var x:testFalse
//             ) {
//            System.out.println(x + "\t false : " + x.matches(regex));
//        }
    }

}
