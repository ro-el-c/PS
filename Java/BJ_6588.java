// 골드바흐의 추측
// 4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다.
// 이 추측을 검증하는 프로그램 작성

// 에라토스테네스의 체

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_6588 {
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

        while((n = Integer.parseInt(br.readLine())) != 0) {
            boolean check = false;

            for (int i = 2; i <= n / 2; i++) {
                if (!arr[i] && !arr[n - i]){
                    check = true;
                    sb.append(n + " = " + i + " + " + (n-i) + "\n");
                    break;
                }
            }

            if(!check)
                sb.append("Goldbach's conjecture is wrong.");
        }

        System.out.print(sb);
    }
}