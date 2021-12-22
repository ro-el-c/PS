// 별 찍기 - 16
import java.util.Scanner;

public class BJ_10991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, i, j, k;
        N = sc.nextInt();
        sc.close();

        for(i=0; i<N; i++){
            for(j=0; j<N-i-1; j++)
                System.out.print(" ");
            for(k=0; k<i+1; k++){
                if(k == i)
                    System.out.print("*");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
