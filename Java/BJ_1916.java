// 최소 비용 구하기
// 다익스트라

// 다익스트라, 우선순위 큐 풀이 방법 알아보기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[][] arr = new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(i==j)
                    arr[i][j] = 0;
                else
                    arr[i][j] = Integer.MAX_VALUE;
            }
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            if(arr[start][end] > weight)
                arr[start][end] = weight;
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        long[] distance = new long[N+1];
        for(int i=1; i<=N; i++)
            distance[i] = arr[start][i];

        boolean[] visited = new boolean[N+1];
        visited[start] = true;

        for(int i=0; i<N-1; i++){
            int idx=0;
            long min = Integer.MAX_VALUE;
            for(int j=1; j<=N; j++){
                if(distance[j] < min && !visited[j]){
                    min = distance[j];
                    idx = j;
                }
            }

            visited[idx] = true;
            for(int j=1; j<=N; j++){
                if(!visited[j]){
                    distance[j] = Math.min(distance[idx] + arr[idx][j], distance[j]);
                }
            }
        }

        System.out.print(distance[end]);
    }
}