// 정수 삼각형
// 아래는 크기가 5인 정수 삼각형
//         7
//       3   8
//     8   1   0
//   2   7   4   4
// 4   5   2   6   5
// 맨 위층 7부터 시작, 아래 수 중 하나 선택하여 아래로 내려갈 때,
// 이제까지 선택된 수의 합이 최대가 되는 경로 구하는 프로그램 작성
// 아래층에서 선택할 때는, 현재 층에서 선택된 수의 대각선 왼쪽 or 대각선 오른쪽에 있는 것 중에서만 선택 가능
// 합이 최대가 되는 경로에 있는 수(선택된 수)들의 합 출력

// dp

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N+1][N+1];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<=i; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[N+1][N+1];
        dp[0][0] = arr[0][0];

        for(int i=1; i<N; i++){
            for(int j=0; j<=i; j++){
                if(j==0)
                    dp[i][0] = dp[i-1][0] + arr[i][0];
                else if(j==i)
                    dp[i][i] = dp[i-1][i-1] + arr[i][i];
                else
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
            }
        }

        int ans=dp[N-1][0];
        for(int i=1; i<N; i++)
            ans = Math.max(ans, dp[N-1][i]);

        System.out.print(ans);
    }
}