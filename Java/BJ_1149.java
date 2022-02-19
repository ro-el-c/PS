// RGB 거리
// 집이 N개, 1~N번 집이 순서대로
// 빨, 초, 파 중 하나의 색으로 칠
// 1. 1번 색, 2번 색 다름
// 2. N번 색, N-1번 색 다름
// 3. i번 (2 <= i <= N) 색은 i-1, i+1 번 색과 다름

// dp
// 3가지 색에 대하여 모두 생각한 후 최솟값 출력
// 부분문제 : 현재 색을 칠하는 경우에, 이전 집에 칠했던 색이 지금 칠하려는 색이 아닌 두 경우에 대하여
//            누적된 비용 값 중 최솟값에 현재 색의 비용을 합함
// 최종 [N][0] [N][1] [N][2] 중 최솟값을 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[N][3];

        for(int j=0; j<3; j++)
            dp[0][j] = arr[0][j];

        for(int i=1; i<N; i++){
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + arr[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + arr[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + arr[i][2];
        }

        System.out.print(Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2])));

    }
}
