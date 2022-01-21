// 부녀회장이 될테야
// a층의 b호에 살려면
// (a-1) 층의 1호부터 b 호까지 사람들의 수 합만큼 데려와야 함
// k층 n호에 몇 명 거주하는지 출력
// 0층 i호에 i명이 산다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] apt = new int[15][15];

        for(int i=0; i<15; i++){
            apt[i][1] = 0;
            apt[0][i] = i;
        }

        for(int i=1; i<15; i++){
            for(int j=1; j<15; j++)
                apt[i][j] = apt[i-1][j] + apt[i][j-1];
        }

        int T = Integer.parseInt(bf.readLine());
        int k, n;

        for(int i=0; i<T; i++){
            k = Integer.parseInt(bf.readLine());
            n = Integer.parseInt(bf.readLine());

            sb.append(apt[k][n]).append("\n");
        }

        System.out.print(sb);
    }
}