// 별 찍기 - 8
import java.util.Scanner;

public class BJ_2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=1, j, k, l;

        while(i<N+1){
            for(j=1; j<=i; j++)
                System.out.print("*");
            for(k=i+1; k<=2*N-i; k++)
                System.out.print(" ");
            for(l=2*N-i+1; l<=2*N; l++)
                System.out.print("*");
            System.out.println();
            i++;
        }
        i -= N;
        while(i<N){
            for(j=1; j<=N-i; j++)
                System.out.print("*");
            for(k=N-i+1; k<=N+i; k++)
                System.out.print(" ");
            for(l=N+i+1; l<=2*N; l++)
                System.out.print("*");
            System.out.println();
            i++;
        }
    }
}
