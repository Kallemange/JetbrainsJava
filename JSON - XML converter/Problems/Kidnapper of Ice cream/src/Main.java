import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] words = s.nextLine().split(" ");
        String[] message = s.nextLine().split(" ");
        HashMap<String, Integer> allWordsMap = new HashMap();
        HashMap<String, Integer> messageMap = new HashMap();
        for (String word: words) {
            if (allWordsMap.containsKey(word)){
                allWordsMap.put(word, allWordsMap.get(word) + 1);
            }
            else {
                allWordsMap.put(word, 1);
            }
        }
        for (String word : message) {
            if (messageMap.containsKey(word)){
                messageMap.put(word, allWordsMap.get(word) + 1);
            }
            else {
                messageMap.put(word,1);
            }
        }
        for (var word : messageMap.entrySet()) {
            if( !allWordsMap.containsKey(word.getKey()) || allWordsMap.get(word.getKey()) < word.getValue()){
                System.out.println("You are busted");
                return;
            }
        }
        System.out.println("You get money");
        }
}