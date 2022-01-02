// A/B
// 두 정수 A, B 입력, 실제 정답과 출력값의 오차가 10^(-9) 이하
import java.util.Scanner;

public class BJ_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        System.out.println((double)A/(double)B);
    }
}
