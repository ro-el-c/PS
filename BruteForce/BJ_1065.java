// 한수
// : 각 자리가 등차수열인 양의 정수
// 입력 : 1000보다 작거나 같은 양의 정수
import java.util.Scanner;

public class BJ_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, count=0, length;
        int n1, n2, n3;
        N = sc.nextInt();
        sc.close();
        if(N<100) // 100 미만의 양의 정수는 모두 각 자리가 등차수열인 한수
            System.out.print(N);
        else{
            count = 99; // 100 이상의 숫자에 대하여, 1~99는 모두 한수이므로, count 값을 99로 초기화

            if(N == 1000) // 1000은 네 자리 수이며, 각 자리가 등차수열이 아니므로 한수 X. 따라서, 결과 값이 N이 999일 때 한수의 개수와 동일
                N = 999;

            for(int i=100; i<=N; i++){
                n1 = i%10;
                n2 = (i%100)/10;
                n3 = i/100;

                if(n2-n1 == n3-n2)
                    count++;
            }

            System.out.print(count);
        }
    }
}
