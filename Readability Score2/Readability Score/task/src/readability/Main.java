package readability;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static String filePath;
    private static String[] fileContent;
    private static long wordCount;
    private static long sentenceCount;
    private static int charCount;
    private static double score;

    public static void main(String[] args) {
        initializeFilePath(args);
        initializeFileContent();
        calculate();
        printTheOutput();
    }

    private static void initializeFilePath(String[] args) {
        if (args.length > 0) {
            filePath = args[0];
        } else {
            System.out.println("No file path provided!");
        }
    }

    private static void initializeFileContent() {
        try { // split text on whitespace (every element will be a word)
            fileContent = new String(Files.readAllBytes(Paths.get(filePath))).split("\\s+");
        } catch (IOException e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }
    }

    private static void calculate() {
        wordCount = Arrays.stream(fileContent)
                          .count();
        sentenceCount = Arrays.stream(fileContent)
                              .filter(s -> s.matches(".*[!.?]"))
                              .count();
        // if there is no puntuation after last word add 1 to sentence count
        if (!fileContent[fileContent.length - 1].matches(".*[!.?]")) {
            sentenceCount += 1;
        }
        charCount = Arrays.stream(fileContent)
                          .mapToInt(s -> s.length())
                          .sum();
        score = 4.71 * charCount / wordCount + 0.5 * wordCount / sentenceCount - 21.43;
    }

    private static void printTheOutput() {
        Map<Integer, String> ages = new HashMap<>();
        ages.put(1, "5-6");
        ages.put(2, "6-7");
        ages.put(3, "7-9");
        ages.put(4, "9-10");
        ages.put(5, "10-11");
        ages.put(6, "11-12");
        ages.put(7, "12-13");
        ages.put(8, "13-14");
        ages.put(9, "14-15");
        ages.put(10, "15-16");
        ages.put(11, "16-17");
        ages.put(12, "17-18");
        ages.put(13, "18-24");
        ages.put(14, "24+");

        System.out.println("The text is: ");
        for (String string : fileContent) {
            System.out.print(string + " ");
        }

        System.out.println("\n\nWords: " + wordCount);
        System.out.println("Sentences: " + sentenceCount);
        System.out.println("Characters: " + charCount);
        System.out.printf("The score is: %.2f\n", score);
        // handle cases when score doesn't meet the conditions: 0 < score <= 14
        System.out.println(String.format(
            "This text should be understood by %s year olds.",
            score > 14 ? "24+" : score > 0 ? ages.get((int) Math.ceil(score)) : "5-6"));
    }
}
