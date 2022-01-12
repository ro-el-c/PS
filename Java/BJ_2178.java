// 미로 탐색
// bfs

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_2178 {
    static int[][] map;
    static boolean[][] visited;
    static int N, M;
    static int[] xx = {0, -1, 0, +1};
    static int[] yy = {-1, 0, +1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            str = bf.readLine();
            for(int j=0; j<M; j++)
                map[i][j] = str.charAt(j) - '0';
        }

        visited[0][0] = true;
        bfs(0, 0);
        System.out.print(map[N-1][M-1]);

    }

    public static void bfs(int x, int y){
        Queue<Where> que = new LinkedList<>();
        que.offer(new Where(x, y));

        int nextX, nextY;

        while(!que.isEmpty()){
            Where temp = que.poll();
            int nowX=temp.row, nowY=temp.col;

            for(int i=0; i<4; i++){
                nextX = nowX + xx[i];
                nextY = nowY + yy[i];

                /* 다음에 방문할 칸의 인덱스가 범위를 벗어나면 무시 */
                if(nextX < 0 || nextX >= N || nextY < 0 || nextY >= M )
                    continue;
                /* 다음에 방문할 칸을 이미 방문했거나, 갈 수 없는 칸이면 무시 */
                if(visited[nextX][nextY] || map[nextX][nextY] == 0)
                    continue;

                /* 갈 수 있는 칸을 큐에 삽입 */
                que.offer(new Where(nextX, nextY));
                /* 큐에 삽입 직후 방문 표시 !!!! 안 할 시 여러번 삽입 => 메모리 초과 !!! */
                visited[nextX][nextY] = true;
                /* 지금까지 온 칸의 개수를 새기 위하여 다음 칸의 값을 현재 칸의 값 +1 */
                map[nextX][nextY] = map[nowX][nowY] + 1;
            }
        }
    }
}

class Where{
    int row, col;

    Where(int x, int y){
        row = x;
        col = y;
    }
}