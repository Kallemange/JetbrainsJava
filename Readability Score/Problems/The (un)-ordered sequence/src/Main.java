import javax.swing.*;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isOrdered = true;
        int n = s.nextInt();
        int m = 0;
        boolean asc = false;
        if (n != 0) {
            m = s.nextInt();
            while (m == n) {
                m = s.nextInt();
            }
        }
        if (m > n) {
            asc = true;
        }
        n = m;
        while (n != 0) {
            m = s.nextInt();
            if (m==0){
                n=m;
                continue;
            }
            if ((m>=n)!=asc ){
                System.out.println("false");
                return;
            }
            n=m;
        }
        System.out.println("true");
    }


}

/*
while n != 0
else get m
if m>n
    while n !=0
        if m<n
            false
            break
if
 */