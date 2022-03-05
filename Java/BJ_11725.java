// 트리의 부모 찾기

// dfs, bfs 모두 가능
// 본인 dfs 로 풀이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ_11725 {
    static int N;
    static ArrayList<Integer>[] list;
    static boolean[] check;
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        list = new ArrayList[N+1];
        check = new boolean[N+1];
        parents = new int[N+1];

        for(int i=1; i<=N; i++)
            list[i] = new ArrayList<>();

        // 인접한 노드 기록
        for(int i=0; i<N-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list[x].add(y);
            list[y].add(x);
        }

        for(int i=1; i<=N; i++){
            if(!check[i]){
                dfs(i);
            }
        }

        for(int i=2; i<=N; i++)
            sb.append(parents[i]).append("\n");

        System.out.print(sb);
    }

    // 깊이 우선 탐색
    public static void dfs(int vertex){
        check[vertex] = true;

        // vertex 노드의 자식 노드 중 방문하지 않은 노드 dfs
        for(int next_v : list[vertex]){
            if(!check[next_v]){
                parents[next_v] = vertex;
                dfs(next_v);
            }
        }
    }
}