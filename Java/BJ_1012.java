// 유기농 배추
// 필요한 최소 배추흰지렁이 마리 수 출력

// bfs
// 배추가 심어져 있는 곳을 시작으로 너비우선탐색
// 인접한 배추와, 그 배추의 인접한 배추들에 방문 표기
// => 구역 별 개수 +1 가능
// 배추가 있는 곳인데, 이미 이전에 있었던 배추의 인접했던 배추였을 때
// 방문 표기가 되어있으므로 카운트에 포함 X

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_1012 {
    static int M, N, K;
    static int[][] arr;
    static boolean[][] visited;
    static int cnt;

    static int[] xx = { 0, -1, 0, 1 };
    static int[] yy = { 1, 0, -1, 0 };

    static void bfs(int x, int y) {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[] { x, y });

        while (!que.isEmpty()) {
            int[] temp = que.poll();
            visited[temp[0]][temp[1]] = true;
            for (int i = 0; i < 4; i++) {
                int nX = temp[0] + xx[i];
                int nY = temp[1] + yy[i];

                if (nX >= 0 && nY >= 0 && nX < M && nY < N) {
                    if (!visited[nX][nY] && arr[nX][nY] == 1) {
                        que.add(new int[] {nX, nY});
                        visited[nX][nY] = true;
                    }
                }

            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int c = 0; c < T; c++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            arr = new int[M][N];
            visited = new boolean[M][N];
            cnt=0;

            for (int i = 0; i < K; i++) {
                st=new StringTokenizer(br.readLine()," ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[x][y] = 1;

            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (arr[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }
}