// DFS와 BFS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class BJ_1260 {
    static StringBuilder sb1 = new StringBuilder();
    static StringBuilder sb2 = new StringBuilder();
    static int[][] graph;
    static int n, m, v;
    static boolean[] visited;

    public static void dfs(int v){
        visited[v-1] = true;
        sb1.append(v + " ");

        for(int i=1; i<=n; i++){
            if(graph[v][i] == 1 && !visited[i-1])
                dfs(i);
        }
    }
    public static void bfs(int v){
        Queue<Integer> que = new LinkedList<>();
        que.offer(v);
        sb2.append(v + " ");
        visited[v-1] = true;

        while(!que.isEmpty()){
            int temp = que.poll();

            for(int i=1; i<=n; i++){
                if(graph[temp][i] == 1 && !visited[i-1]){
                    que.offer(i);
                    visited[i-1] = true;
                    sb2.append(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        graph = new int [n+1][n+1];
        int x, y;
        for(int i=0; i<m; i++){
            st = new StringTokenizer(bf.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        visited = new boolean[n];
        dfs(v);
        System.out.println(sb1);
        visited = new boolean[n];
        bfs(v);
        System.out.print(sb2);

    }
}