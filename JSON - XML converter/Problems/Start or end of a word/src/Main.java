import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine().replaceAll("[\\,\\!\\?\\.]", " ");


        Pattern patternStart    = Pattern.compile("(^|[^a-zA-Z])" +part + "\\w", Pattern.CASE_INSENSITIVE);
        Pattern patternEnd      = Pattern.compile("\\w" + part +"([^a-zA-Z]|$)", Pattern.CASE_INSENSITIVE);
        Pattern pattern         = Pattern.compile("\\s" + part + "\\s", Pattern.CASE_INSENSITIVE);
        Matcher matcherStart    = patternStart.matcher(line);
        Matcher matcherEnd      = patternEnd.matcher(line);
        Matcher matcher         = pattern.matcher(line);

        if ( matcherEnd.find()|| matcherStart.find()  || matcher.find() ){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        // write your code here
    }
}