// 가장 긴 증가하는 부분 수열 (LIS : Longest Increasing Subsequence)
// 1. 완전 탐색 (2^N)
// 2. DP (N^2)
// 3. 이분 탐색 (NlogN)

// dp

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        int ans=dp[0];
        for(int i=1; i<N; i++){
            for(int j=0; j<i; j++){
                if(arr[j] < arr[i] && dp[i] <= dp[j])
                    dp[i] = Math.max(dp[j]+1, dp[i]);
            }
            ans = Math.max(ans, dp[i]);
        }

        System.out.print(ans);
    }
}