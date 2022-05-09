// 오목

// 브루트포스

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2615 {
    static int[][] map = new int[21][21];
    static int[][][] memoCnt = new int[21][21][4];
    static int[] dx = new int[] {1, 1, 0, -1};
    static int[] dy = new int[] {0, 1, 1, 1};

    public static int calculate(int i, int j, int d, int color){
        int nx = i + dx[d];
        int ny = j + dy[d];

        if(map[nx][ny] != color)
            return 1;
        else
            return memoCnt[nx][ny][d] = calculate(nx, ny, d, color) + 1;
    }

    public static String WhoWinOrNot(){
        for(int j=1; j<20; j++){
            for(int i=1; i<20; i++){
                if(map[i][j] == 1 || map[i][j] == 2){
                    for(int k=0; k<4; k++){
                        if(memoCnt[i][j][k] == 0 && calculate(i, j, k, map[i][j]) == 5)
                            return map[i][j] + "\n" + i + " " + j;
                    }
                }
            }
        }
        return "0";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=1; i<20; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<20; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        System.out.print(WhoWinOrNot());
    }
}
