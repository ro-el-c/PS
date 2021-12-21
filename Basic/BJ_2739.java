// 구구단
// N 입력받고, 구구단 N단 출력
import java.util.Scanner;

public class BJ_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        for(int i=1; i<=9; i++){
            System.out.printf("%d * %d = %d\n", N, i, N*i);
        }
    }
}
