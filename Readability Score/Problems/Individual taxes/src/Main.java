import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] companyIncome = new int[N];
        int[] companyTax = new int[N];
        int maxTax = 0;
        int maxTaxIdx = 0;
        for (int i=0;i<N;i++){
            companyIncome[i] = s.nextInt();
                    }
        for (int i=0;i<N;i++){
            companyTax[i] = s.nextInt();
        }
        int tax;
        for (int i=0;i<N;i++){
            tax = companyTax[i]*companyIncome[i];
            if (tax>maxTax){
                maxTax=tax;
                maxTaxIdx = i+1;
            }
        }
        System.out.println(maxTaxIdx);
    }
}