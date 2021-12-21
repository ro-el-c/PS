// 별 찍기 - 12
import java.util.Scanner;

public class BJ_2522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i, j, k, l;

        for(i=1; i<2*N; i++){
            if(i<=N){
                for(j=1; j<=N-i; j++)
                    System.out.print(" ");
                for(l=N-i+1; l<=N; l++)
                    System.out.print("*");
                System.out.println();
            }
            else{
                for(j=1; j<=i-N; j++)
                    System.out.print(" ");
                for(l=i-N+1; l<=N; l++)
                    System.out.print("*");
                System.out.println();
            }
        }

    }
}
