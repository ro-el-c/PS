// 퇴사

// dp
// dp[i + t[i]] = max(dp[i + t[i]], dp[i] + p[i])

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_14501 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(reader.readLine());

        int[] t = new int[n];
        int[] p = new int[n];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(reader.readLine());

            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n+1];

        for (int i=0; i<n; i++) {
            if (i + t[i] <= n)
                dp[i + t[i]] = Math.max(dp[i + t[i]], dp[i] + p[i]);

            dp[i+1] = Math.max(dp[i+1], dp[i]);
        }

        System.out.print(dp[n]);

    }
}
