package readability;

import org.hamcrest.core.Is;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class Main {
    private static String filePath;
    private static String[] fileContent;
    private static long wordCount;
    private static long sentenceCount;
    private static long charCount;
    private static int vowelCount;
    private static int polySyllableCount;
    private static double score;

    public static void main(String[] args) {
        initializeFilePath(args);
        //String filePath = "Readability Score\\task\\src\\readability\\testFil.txt";
        File file = new File(filePath);
        initializeFileContent(file);
        countFileContent();
        printFileContent();
        Scanner inputScore = new Scanner(System.in);
        System.out.println("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
        String index = inputScore.next();
        printScore(index);
        inputScore.close();



    }

    private static void initializeFilePath(String[] args){
        if(args.length>0){
            filePath = args[0];
        }
        else {
            System.out.println("No path provided");
            return;
        }
    }

    private static void printFileContent(){
        System.out.println("The text is: ");
        for (String word: fileContent) {
            System.out.print(word + " ");
        }
        System.out.println("\n");
        System.out.println("Words: " + wordCount);
        System.out.println("Sentences: " + sentenceCount);
        System.out.println("Characters: " + charCount);
        System.out.println("Syllables: " + vowelCount);
        System.out.println("Polysyllables: " + polySyllableCount);
    }

    private static void initializeFileContent(File file) {
        try {
            String str = "";
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                str += scanner.next() + " ";
            }
            scanner.close();
            fileContent = str.split(" ");
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage());
        }
    }

    private static void countFileContent(){
        String word;
        vowelCount = 0;
        polySyllableCount = 0;
        int lengthOfWord;
        for (int i = 0; i<fileContent.length -1; i++){
            word = fileContent[i];
            lengthOfWord = word.length();


            //Count chars
            charCount += lengthOfWord;

            //Count sentences
            if(word.matches(".*[\\.\\!\\?]")){
                sentenceCount += 1;
            }

            //Count syllables;
            vowelCount += countVowels(word);

        }
        charCount += fileContent[fileContent.length-1].length();
        sentenceCount += 1;
        wordCount = fileContent.length;

    }

    private static int countVowels(String word){
        int vowels = 0;

        if(isNumeric(word)){
            return 0;
        }
        word = word.replaceAll("[\\.\\!\\?]", "");
        boolean isPrevCharVowel = false;
        int lengthOfWord = word.length();
        char finalChar = word.charAt(lengthOfWord-1);
        //Count vowels
        for (int j = 0; j < lengthOfWord-1; j++) {
            if(isVowel(word.charAt(j))){
                if(!isPrevCharVowel){
                    vowels += 1;
                }
                isPrevCharVowel = true;
            }
            else {
                isPrevCharVowel = false;
            }
        }
        if(isVowel(finalChar) && toLowerCase(finalChar) != 'e' && !isPrevCharVowel){
            vowels += 1;
        }
        if (vowels == 0){
            vowels = 1;
        }
        if (vowels > 2){
            polySyllableCount += 1;
        }
        return vowels;
    }

    private static boolean isNumeric(String w){
        double number;
        try {
            w.replaceAll(",", "");
            number = Double.parseDouble(w);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
    private static double ARIScore(){
        double score;
        try {
            score = 4.71 * (double) charCount / wordCount +
                    0.5 * (double) wordCount / sentenceCount - 21.43;
        }
        catch (ArithmeticException e){
            score = 1;
        }
        return score;
    }
    private static double FKScore(){
        double score;
        try {
            score = 0.39 * (double) wordCount / sentenceCount +
                    11.8 * (double) vowelCount / wordCount - 15.59;
        }
        catch (ArithmeticException e){
            score = 1;
        }
        return score;
    }

    private static double SMOGScore(){
        double score;
        try {
            score = 1.043*Math.sqrt(polySyllableCount * 30.0/sentenceCount)+3.1291;
        }
        catch (ArithmeticException e){
            score = 1;
        }
        return score;
    }

    private static String ageByScore(double score){
        int age = 0;
        Map<Integer, String> ages = new HashMap<>();
        ages.put(1, "6");
        ages.put(2, "7");
        ages.put(3, "9");
        ages.put(4, "10");
        ages.put(5, "11");
        ages.put(6, "12");
        ages.put(7, "13");
        ages.put(8, "14");
        ages.put(9, "15");
        ages.put(10, "16");
        ages.put(11, "17");
        ages.put(12, "18");
        ages.put(13, "24");
        ages.put(14, "24+");

        return ages.get((int)Math.round(score));
    }

    private static double CLScore(){
        double score;
        try {
            double L = 100 * (double) charCount / (wordCount);
            double S = 100 * (double) sentenceCount / (wordCount);
            score = 0.0588 * L - 0.296 * S - 15.8;
        }
        catch (ArithmeticException e){
            score = 1;
        }
        return score;
    }
    private static void printScore(String index){

        switch (index){
            case "ARI":
                printARI();
                break;
            case "FK":
                printFKI();
                break;
            case "SMOG":
                printSMOG();
                break;
            case "CL":
                printCL();
                break;
            case "all":
                printARI();
                printFKI();
                printSMOG();
                printCL();
        }
    }

    private static void printARI(){
        double ARIscore = ARIScore();
        System.out.println("Automated Readability Index: " + String.format("%.2f", ARIscore) +
                " (about " + ageByScore(ARIscore) + " year olds).");
    }
    private static void printFKI() {
        double FKIscore = FKScore();
        System.out.println("Flesch–Kincaid readability tests: " + String.format("%.2f", FKIscore) +
                " (about " + ageByScore(FKIscore) + " year olds).");
    }
    private static void printSMOG() {
        double SMOGScore = SMOGScore();
        System.out.println("Simple Measure of Gobbledygook: " + String.format("%.2f", SMOGScore)  +
                " (about " + ageByScore(SMOGScore) + " year olds).");
    }
    private static void printCL() {
        double CLScore = CLScore();
        System.out.println("Coleman–Liau index: " + String.format("%.2f", CLScore) +
                " (about " + ageByScore(CLScore) + " year olds).");
    }

    private static boolean isVowel(char C){
        char c = toLowerCase(C);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y'){
            return true;
        }
        return false;
    }

}
