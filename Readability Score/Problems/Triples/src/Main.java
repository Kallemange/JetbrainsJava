import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int noTriples = 0;
        for(int i = 0; i<n;i++){
            arr[i] = s.nextInt();
        }
        for (int i=0; i<n-2;i++){
            noTriples+=findTriple(arr, i);
        }
        System.out.println(noTriples);
    }
    public static int findTriple(int[] seq, int i){
        if ((seq[i+2]-seq[i+1]==1)&&seq[i+1]-seq[i]==1){
            return 1;
        }
        else {
            return 0;
        }
    }
}