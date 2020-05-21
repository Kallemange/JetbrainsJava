import java.util.Scanner;

public class Main {

    public static String prepareFullName(String firstName, String lastName)
    {
        String returnStr ="";
        try {
            if (!firstName.isBlank()) {
                returnStr = firstName;
            }
        }
        catch (Exception e){
        }
        try {
            if (!lastName.isBlank()) {
                if (!returnStr.isBlank()) {
                    returnStr += " ";
                }
                returnStr += lastName;
            }
        }
        catch (Exception e2){
        }
        return returnStr;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        //Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}