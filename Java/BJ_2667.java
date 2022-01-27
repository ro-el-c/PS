// 단지번호붙이기
// 1 : 집 O
// 0 : 집 X
// 단지 : 연결된 집의 모임
// -> 대각선은 연결 X

// dfs

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BJ_2667 {
    static int N, cnt;
    static int[][] home;
    static boolean[][] visited;
    static int[] num_list;
    static int[] xx = {1, -1, 0, 0};
    static int[] yy = {0, 0, 1, -1};


    public static void bfs(int x, int y){
        Queue<int[]> que = new LinkedList<>();
        visited[x][y] = true;
        num_list[cnt]++;
        que.offer(new int[]{x, y});

        while(!que.isEmpty()){
            int[] temp = que.poll();

            for(int i=0; i<4; i++){
                int nx = temp[0] + xx[i];
                int ny = temp[1] + yy[i];

                if(nx<0 || nx>=N || ny<0 || ny>=N)
                    continue;

                if(visited[nx][ny] || home[nx][ny] != 1)
                    continue;

                que.offer(new int[]{nx, ny});
                visited[nx][ny] = true;
                num_list[cnt]++;
            }
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(bf.readLine());
        home = new int[N][N];
        visited = new boolean[N][N];
        num_list = new int[(N*N+1)/2];

        for(int i=0; i<N; i++){
            String str = bf.readLine();
            for(int j=0; j<N; j++)
                home[i][j] = Integer.parseInt(Character.toString(str.charAt(j)));
        }

        cnt = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(home[i][j]==1 && !visited[i][j]){
                    bfs(i,j);
                    cnt++;
                }
            }
        }

        sb.append(cnt + "\n");

        Arrays.sort(num_list);

        for(int i=0; i<num_list.length; i++){
            if(num_list[i] == 0)
                continue;
            else
                sb.append(num_list[i] + "\n");
        }

        System.out.print(sb);
    }
}