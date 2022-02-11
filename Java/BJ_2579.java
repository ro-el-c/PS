// 계단 오르기
// 1. 한 번에 한 계단 or 두 계단
// 2. 연속된 세 개의 계단 X
// 3. 마지막 도착 계단 반드시

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stairs = new int[N+2];
        int[] ans = new int[N+2];
        for(int i=1; i<=N; i++)
            stairs[i] = Integer.parseInt(br.readLine());

        ans[1] = stairs[1];
        ans[2] = stairs[1] + stairs[2];

        for(int i=3; i<=N; i++)
            ans[i] = Math.max(ans[i-2] + stairs[i], ans[i-3] + stairs[i-1] + stairs[i]);
        // n-3 n-2 n-1 n
        // 1. n-2 에서 n 으로
        //    : ans[i-2] 에 올라가려는 n 계단의 점수를 합함
        // 2. n-3 에서 n-1, n 으로
        //    : ans[i-3] n-1과 n 칸의 점수 합하기
        //      ans[n-1] 안 되는 이유는 계단 올라간 과정이 안 맞을 수 있기 때문

        System.out.print(ans[N]);

    }
}