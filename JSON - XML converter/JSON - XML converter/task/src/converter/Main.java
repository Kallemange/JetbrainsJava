package converter;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    private static String input;
    private static String output;
    private static String key = "";
    private static String val = "";
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            input = scanner.nextLine().trim();
            if (input.charAt(0)=='<'){
                extractXML();
                convertToJSON();
            }
            else if (input.charAt(0) == '{'){
                extractJSON();
                convertToXML();
            }
            else{
                System.out.println("no string provided");
            }
            System.out.println(output);
        }
        catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }

    private static void extractXML(){
        char c = ' ';
        int i = 1;
        try {
            c = input.charAt(i);
            while (c != '>' && c != '/'){
                key += String.valueOf(c);
                c = input.charAt(++i);
            }
            if (c == '/'){
                val = "";
            }
            else {
                val = input.replace("<" + key + ">", "")
                        .replace("</" + key + ">", "");
            }
            }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("End of input reached without close");
        }
    }
    private static void extractJSON(){
        String[] strings;
        try {
            strings = input.split(":");
            key = strings[0].replaceAll("\\{", "").replaceAll("\"", "");
            val = strings[1].replace("}", "").replaceAll("\"", "");
            val = val.matches("null") ? "" : val;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("End of input reached without close");
        }
    }

    private static void convertToJSON(){
        output = "{ \"" + key + "\" : ";
        output += val.isBlank() ? "null": "\"" + val + "\"";
        output += " }";
    }

    private static void convertToXML(){
        output = "<" + key;
        if (val.isBlank()){
            output += "/>";
            return;
        }
        output += ">" + val;
        output += "</" + key + ">";
    }
}
