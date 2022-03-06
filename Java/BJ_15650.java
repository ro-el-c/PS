// N과 M (2)

// 백트래킹 - dfs

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_15650 {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int x, int depth){
        if(depth == M){
            for(int temp : arr)
                sb.append(temp).append(" ");
            sb.append("\n");
            return;
        }

        for(int i=x; i<=N; i++){
            arr[depth] = i;
            dfs(i+1, depth+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        dfs(1, 0);
        System.out.print(sb);
    }
}