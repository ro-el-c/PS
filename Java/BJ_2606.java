// 바이러스
// 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_2606 {
    static boolean[][] arr;
    static boolean[] visited;
    static int comp, link;

    public static void bfs(int start){
        Queue<Integer> que = new LinkedList<>();
        int cnt=0;

        visited[start] = true;
        que.offer(start);

        while(!que.isEmpty()){
            int x = que.poll();

            for(int i=1; i<=comp; i++){
                if(arr[x][i] && !visited[i]){
                    que.offer(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        comp = Integer.parseInt(bf.readLine());
        link = Integer.parseInt(bf.readLine());

        arr = new boolean[comp+1][comp+1];
        visited = new boolean[comp+1];


        for(int i=0; i<link; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = true;
            arr[y][x] = true;
        }

        bfs(1);
    }
}