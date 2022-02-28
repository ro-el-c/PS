// 가장 긴 감소하는 부분 수열

// dp

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11722 {
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
                if(arr[i] < arr[j] && dp[i] <= dp[j])
                    dp[i] = dp[j] + 1;
                else if(arr[i] == arr[j])
                    dp[i] = dp[j];
            }
            ans = Math.max(ans, dp[i]);
        }

        System.out.print(ans);
    }
}