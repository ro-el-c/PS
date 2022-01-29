// 특정 거리의 도시 찾기
// 인접 리스트, bfs

// 다익스트라 가능 (우선순위 큐) : 구현 X

import java.io.*;
import java.util.*;

public class BJ_18352{
    static ArrayList<Integer>[] graphMatrix;
    static int n, start, targetLength;
    static int [] distance;
    static int N, M, K, X;

    public static void bfs(){
        Queue<Integer> que = new LinkedList<>();

        que.offer(X);
        distance[X] = 0;

        while(!que.isEmpty()){
            int temp = que.poll();

            for(int nx : graphMatrix[temp]){
                if(distance[nx] > distance[temp] + 1){
                    // 기존 경로의 길이가 현재 노드를 경유하는 것보다 길 때,
                    // 길이 갱신
                    distance[nx] = distance[temp] + 1;
                    que.offer(nx);
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        String str;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        graphMatrix = new ArrayList[N+1];
        distance = new int[N+1];

        for(int i=1; i<=N; i++){
            graphMatrix[i] = new ArrayList<>();
            distance[i] = Integer.MAX_VALUE;
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(bf.readLine());
            int x, y;
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            graphMatrix[x].add(y);
        }

        bfs();

        StringBuilder sb = new StringBuilder();
        int cnt=0;

        for(int i=1; i<=N; i++){
            if(distance[i] == K) {
                cnt++;
                sb.append(i + "\n");
            }
        }

        if(cnt == 0)
            System.out.print(-1);
        else
            System.out.print(sb);
    }
}
