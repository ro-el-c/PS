// 마인크래프트
// 땅 고르기 : 땅의 높이를 모두 동일하게
// 가로 M, 세로 N. 맨 왼쪽 위의 좌표는 0, 0
// (i, j) 의 가장 위에 있는 블록 제거 -> 인벤토리에  :  2초
// 인벤토리 블럭 -> (i, j) 가장 위에 있는 블록 위에  : 1초
// 최소 시간, 땅의 높이 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int M, N, B;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        int max=0, min=256;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(max < map[i][j])
                    max = map[i][j];
                if(min > map[i][j])
                    min = map[i][j];
            }
        }

        int min_time=Integer.MAX_VALUE, ans_height=Integer.MIN_VALUE;

        for(int i=min; i<=max; i++){
            int time=0, inventory=B;

            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    int temp = map[j][k] - i;

                    if(temp > 0){ // 제거
                        time += 2*Math.abs(temp);
                        inventory += Math.abs(temp);
                    }
                    else if(temp < 0){ // 추가
                        time += Math.abs(temp);
                        inventory -= Math.abs(temp);
                    }
                }
            }

            if(inventory < 0)
                continue;
            if(time == min_time)
                ans_height = Math.max(ans_height, i);
            else if(time <= min_time) {
                min_time = time;
                ans_height = i;
            }
        }

        System.out.print(min_time + " " + ans_height);
    }
}