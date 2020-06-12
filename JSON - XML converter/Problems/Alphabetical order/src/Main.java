import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] listOfStrings = s.nextLine().split("\\s+");
        String prevWord = listOfStrings[0];
        String word;
//        for (var w: listOfStrings
//             ) {
//            System.out.println(w);
//        }
        for (int i=1; i<listOfStrings.length; i++) {
            word = listOfStrings[i];
            if(prevWord.compareTo(word)>0){
                System.out.println(false);
                return;
            }
            prevWord = word;
        }
        System.out.println(true);

    }
}