// 이항 계수 1
// 조합 nCk

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N, K, a=1, b=1;
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for(int i=N; i>N-K; i--)
            a *= i;
        for(int i=1; i<=K; i++)
            b *= i;

        System.out.print(a/b);
    }
}