// 토마토 (3차원)

// bfs

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class BJ_7569 {
    static int M, N, H;
    static int[] xx = {0, -1, 0, 0, 1, 0};
    static int[] yy = {0, 0, 1, 0, 0, -1};
    static int[] zz = {1, 0, 0, -1, 0, 0};

    static int[][][] box;
    static Queue<tomato> que = new LinkedList<>();

    public static int bfs() {
        while(!que.isEmpty()){
            tomato temp = que.poll();

            for(int i=0; i<6; i++){
                int nx = temp.row + xx[i];
                int ny = temp.col + yy[i];
                int nz = temp.hei + zz[i];

                if(nx<0 || nx>=N || ny<0 || ny>=M || nz<0 || nz>=H)
                    continue;

                if(box[nx][ny][nz] > 0 || box[nx][ny][nz] == -1)
                    continue;

                que.offer(new tomato(nx, ny, nz));
                box[nx][ny][nz] = box[temp.row][temp.col][temp.hei] + 1;
            }
        }

        int max = Integer.MIN_VALUE;
        for(int k=0; k<H; k++){
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(box[i][j][k] == 0)
                        return -1;
                    if(max < box[i][j][k])
                        max = box[i][j][k];
                }
            }
        }

        return max-1; // 첫 날 0일째
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        box = new int[N][M][H];

        for(int k=0; k<H; k++){
            for(int i=0; i<N; i++){
                st = new StringTokenizer(bf.readLine());
                for(int j=0; j<M; j++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                    if(box[i][j][k] == 1)
                        que.offer(new tomato(i, j, k));
                }
            }
        }

        System.out.print(bfs());
    }
}

class tomato {
    int row, col, hei;

    tomato(int x, int y, int z){
        row = x;
        col = y;
        hei = z;
    }
}