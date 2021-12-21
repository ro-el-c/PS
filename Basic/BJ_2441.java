// 별 찍기 - 4
import java.util.Scanner;

public class BJ_2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=N; i>0; i--){
            for(int j=1; j<N-i+1; j++)
                System.out.printf(" ");
            for(int j=N-i+1; j<=N; j++)
                System.out.printf("*");
            System.out.println();
        }
    }
}
