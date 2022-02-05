// 스티커
// 2행 n열 배치
// 스티커 떼면, 변을 공유하는 다른 스티커는 모두 찢어짐
// 각 스티커에 점수 매기고, 합이 최대가 되도록
// 점수의 최댓값 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());
        int[][] arr, dp;

        for(int i=0; i<T; i++){
            int n = Integer.parseInt(bf.readLine());
            arr = new int[2][n+1];
            dp = new int[2][n+1];
            for(int j=0; j<2; j++){
                StringTokenizer st = new StringTokenizer(bf.readLine());
                for(int k=1; k<=n; k++)
                    arr[j][k] = Integer.parseInt(st.nextToken());
            }

            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];

            for(int k=2; k<=n; k++){
                dp[0][k] = Math.max(dp[1][k-1], dp[1][k-2]) + arr[0][k];
                dp[1][k] = Math.max(dp[0][k-1], dp[0][k-2]) + arr[1][k];
            }
            sb.append(Math.max(dp[0][n], dp[1][n]) + "\n");
        }

        System.out.print(sb);
    }
}