// LCA (Lowest Common Ancestor)
// = 최소 공통 조상

// dfs 로 깊이와 부모를 기록
// 최소 공통 조상을 구해야 하는 두 노드의 깊이를 비교하여,
// 깊이가 더 큰 것을 작은 것 깊이의 부모까지 올라감
// 깊이가 같을 때, 두 노드가 같은 노드일 때까지 부모 노드로 거슬러 올라감
// 두 노드가 같아지면, 그것이 최소 공통 조상

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ_11437 {
    static ArrayList<Integer>[] tree;
    static int[] parent;
    static int[] depth;
    static int N, M;
    static boolean[] visited;

    public static void dfs(int x, int dep, int par){
        // x : 현재 노드, dep : 현재 노드의 깊이, par : 현재 노드의 무보 노드
        visited[x] = true;
        depth[x] = dep;
        parent[x] = par;

        // 현재 노드의 모든 자식 노드들에 대하여
        // 방문 전 노드(자식 노드)를 탐색. 깊이 +1
        for(int nx : tree[x]){
            if(!visited[nx])
                dfs(nx, dep+1, x);
        }
    }

    public static int lca(int a, int b){
        // 최소 공통 조상을 구할 두 노드 a, b
        int ad = depth[a];
        int bd = depth[b];

        // 두 노드의 깊이가 같아질 때까지
        // 깊이가 더 큰 노드에 대하여 부모 노드로 거슬러 올라감
        while(ad > bd){
            a = parent[a];
            ad--;
        }

        while(ad < bd){
            b = parent[b];
            bd--;
        }

        // 두 노드의 깊이가 같아졌을 때
        // 두 노드가 같아질 때까지 부모 노드로 거슬러 올라감
        while(a != b){
            a = parent[a];
            b = parent[b];
            /*ad--;
            bd--;*/
        }

        // 두 노드가 같아지면, 그 노드가 최소 공통 조상 (이 때, a==b)
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(bf.readLine());

        tree = new ArrayList[N+1];
        parent = new int[N+1];
        depth = new int[N+1];
        visited = new boolean[N+1];

        // 트리 생성
        for(int i=1; i<=N; i++)
            tree[i] = new ArrayList<>();

        for(int i=1; i<N; i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // a-b : 서로 저장. 부모, 자식 모두 저장됨
            tree[a].add(b);
            tree[b].add(a);
        }

        // 1번 노드 : 루트 노드
        // - 부모 노드 없음. (-1로 표시)
        // - 깊이 = 0
        dfs(1, 0, -1);

        M = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<M; i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(lca(a, b) + "\n");
        }

        System.out.print(sb);
    }
}