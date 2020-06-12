import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] intArray = s.nextLine().split(" ");
        int N = s.nextInt();
        ArrayList<Integer> index = new ArrayList<Integer>();
        int minDist = Integer.MAX_VALUE;
        int currInt;
        int currDist;
        for (int i = 0; i<intArray.length; i++) {
            currInt = Integer.parseInt(intArray[i]);
            currDist = Math.abs(currInt - N);
            if (currDist < minDist){
                index.clear();
                index.add(i);
                minDist = currDist;
            }
            else if(Math.abs(currInt - N) == minDist){
                index.add(i);
            }
            else {}
        }
        int[] minDistList = new int[index.size()];
        for (int i = 0; i<index.size(); i++) {
            minDistList[i] = Integer.parseInt(intArray[index.get(i)]);
        }
        Arrays.sort(minDistList);
        for (int val: minDistList
             ) {

            System.out.print(val + " ");
        }



    }
}