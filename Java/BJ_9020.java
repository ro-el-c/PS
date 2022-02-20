// 골드바흐의 추측
// 4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다.
// 이 추측을 검증하는 프로그램 작성

// 두 소수의 차이가 가장 작은 것을 출력

// 에라토스테네스의 체

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9020 {
    static boolean[] arr;

    public static void checkPrimeNum(){
        for(int i=2; i<=1000000; i++){
            if(arr[i])
                continue;

            for(int j=2; i*j<=1000000; j++){
                arr[i*j] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        arr = new boolean[1000001]; // 값이 false인 인덱스가 소수
        checkPrimeNum();

        int n;
        int T = Integer.parseInt(br.readLine());

        for(int k=0; k<T; k++) {
            n = Integer.parseInt(br.readLine());
            boolean check = false;
            int ansN=0;

            for (int i = 2; i <= n / 2; i++) {
                if (!arr[i] && !arr[n - i]){
                    check = true;
                    if(n-2*ansN > n-2*i)
                        ansN = i;
                }
            }

            if(!check)
                sb.append("Goldbach's conjecture is wrong.");
            else
                sb.append(ansN + " " + (n-ansN) + "\n");
        }

        System.out.print(sb);
    }
}