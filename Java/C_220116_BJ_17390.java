// 이건 꼭 풀어야 해!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class C_220116_BJ_17390 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int[] arr = new int[N+1];
        arr[0]=0;
        for(int i=0; i<N; i++){
            arr[i+1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        // 누적 합
        for(int i=2; i<=N; i++){
            arr[i] = arr[i] + arr[i-1];
        }

        // ex
        // 0 1 2 3 4 5
        // 0 1 3 6 10 15
        for(int i=0; i<Q; i++){
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            sb.append(arr[y] - arr[x-1] + "\n");
        }

        System.out.print(sb);
    }
}