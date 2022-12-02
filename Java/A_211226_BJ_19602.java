// Dog Treats

import java.util.Scanner;

public class A_211226_BJ_19602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S, M, L;
        S = sc.nextInt();
        M = sc.nextInt();
        L = sc.nextInt();
        sc.close();

        if(1*S + 2*M + 3*L >= 10)
            System.out.print("happy");
        else
            System.out.print("sad");
    }
}
