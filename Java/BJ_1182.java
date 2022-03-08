// 부분수열의 합
// N개의 정수로 이루어진 수열
// 크기가 양수인 부분수열 중
// 원소를 다 더한 값이 S가 되는 경우의 수

// dfs

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1182 {
    static int N, S, cnt=0;
    static int[] arr;
    public static void dfs(int x, int sum){
        if(x == N){
            if(sum == S)
                cnt++;
            return;
        }

        dfs(x+1, sum+arr[x]);
        dfs(x+1, sum);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        dfs(0, 0);

        if(S==0) // 공집합 제외
            System.out.print(--cnt);
        else
            System.out.print(cnt);
    }
}
