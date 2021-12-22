// 별 찍기 - 9
import java.util.Scanner;

public class BJ_2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, i, j, k;
        N = sc.nextInt();
        sc.close();

        for(i=0; i<N;i++){
            for(j=0; j<i; j++)
                System.out.print(" ");
            for(k=0; k<2*(N-i)-1; k++)
                System.out.print("*");
            System.out.println();
        }
        for(i=1; i<N; i++){
            for(j=0; j<N-i-1; j++)
                System.out.print(" ");
            for(k=0; k<2*i+1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
