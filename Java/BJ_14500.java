// 테트로미노
import java.io.*;
import java.util.*;

public class BJ_14500 {
    static int[][] map;
    static int n, m;
    static int max=1;

    static int[][] dx = {
            {0, 0, 1, 1}, // ㅁ
            {0, 1, 2, 2}, {0, 0, 0, 1}, {0, 0, 1, 2}, {0, 1, 1, 1}, {0, 1, 2, 2}, {0, 1, 1, 1}, {0, 0, 1, 2}, {0, 0, 0, 1}, // ㄴ
            {0, 0, 0, 0}, {0, 1, 2, 3}, // ㅣ
            {0, 1, 1, 1}, {0, 1, 1, 2}, {0, 0, 0, 1}, {0, 1, 1, 2}, // ㅗ
            {0, 1, 1, 2}, {0, 0, 1, 1}, {0, 1, 1, 2}, {0, 0, 1, 1} // ㄱㄴ
    };
    static int[][] dy = {
            {0, 1, 0, 1},
            {0, 0, 0, 1}, {0, 1, 2, 0}, {0, 1, 1, 1}, {2, 0, 1, 2}, {1, 1, 0, 1}, {0, 0, 1, 2}, {0, 1, 0, 0}, {0, 1, 2, 2},
            {0, 1, 2, 3}, {0, 0, 0, 0},
            {1, 0, 1, 2}, {0, 0, 1, 0}, {0, 1, 2, 1}, {1, 0, 1, 1},
            {0, 0, 1, 1}, {1, 2, 0, 1}, {1, 0, 1, 0}, {0, 1, 1, 2}
    };

    private static void solution() {
        // 모든 경우에 대하여 계산
        for (int i=0; i<map.length; i++) { // n
            for (int j=0; j<map[0].length; j++) { // m
                for (int k=0; k<dx.length; k++) { // 19개의 도형에 대하여
                    int sum = 0;
                    boolean flag = true;
                    for (int l=0; l<4; l++) { // 4개의 정사각형에 위치한 값의 합
                        int nextX = i+dx[k][l];
                        int nextY = j+dy[k][l];
                        if (nextX >= map.length | nextY >= map[0].length) {
                            flag = false;
                            break;
                        }

                        sum += map[nextX][nextY];
                    }

                    if(!flag) continue;

                    max = Math.max(sum, max);
                }
            }
        }

        System.out.print(max);
    }

    private static void getInput() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j=0; j<m; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }
    }

    public static void main(String[] args) throws IOException {
        getInput();
        solution();
    }
}