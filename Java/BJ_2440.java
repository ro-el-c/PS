// 별 찍기 - 3
import java.util.Scanner;

public class BJ_2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=N; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
