import java.util.Scanner;

class RemoveExtraSpacesProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        text = text.strip();
        String regex = "\\s\\s+";
        String str = " ";
        String result = text.replaceAll(regex, str);
        System.out.println(result);

    }
}