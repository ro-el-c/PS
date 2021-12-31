// 2021은 무엇이 특별할까?
// 연속한 두 소수의 곱으로 이루어져 있는 수를 "특별한 수"라고 할 때
// 입력으로 주어진 N보다 큰 특별한 수 중 가장 작은 수 출력

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class BJ_24039_goodbye2021_A {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int tmp=2;
        int N = Integer.parseInt(bf.readLine());

        int[] arr = new int[10001];
        arr[1] = 1; // 1은 소수가 아님.

        for(int i=2; i<=10000; i++) { // 숫자 i에 대하여 소수 여부 저장
            if (arr[i] != 1)
                for (int j = 2; i * j <= N; j++) { // 범위 내에서, 소수가 아닌 수 1로 저장
                    arr[i * j] = 1;
                }
        }

        for(int i=3; i<10001; i++){
            if(arr[i] == 0){
                if(tmp*i > N){
                    System.out.println(tmp*i);
                    return;
                }
                else
                    tmp = i;
            }
        }

    }
}