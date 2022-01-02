// 별 찍기 - 17
import java.util.Scanner;

public class BJ_10992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, i, j, k;
        N = sc.nextInt();
        sc.close();

        for(i=0; i<N-1; i++){
            for(j=0; j<N-i-1; j++)
                System.out.print(" ");
            System.out.print("*");
            if(i != 0){
                for(j=0; j<2*i-1; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
        for(j=0; j<2*N-1; j++)
            System.out.print("*");
    }
}
