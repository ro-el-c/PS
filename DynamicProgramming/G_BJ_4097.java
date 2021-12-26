// 수익

import java.util.Scanner;

public class G_BJ_4097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, num;
        while(true){
            N = sc.nextInt();

            if(N == 0)
                break;

            int[] maxR = new int[N];
            maxR[0] = sc.nextInt();

            for(int i=1; i<N; i++){
                num = sc.nextInt();
                // 직전 달까지 수익 누적 + 현재 수익 vs 현재 수익 중 큰 값 저장
                maxR[i] = Math.max(num, maxR[i-1]+num);
            }

            // 저장된 최대 누적 수익 값 중 최댓값 출력
            int max = Integer.MIN_VALUE;
            for(int i=0; i<N; i++){
                if(max < maxR[i])
                    max = maxR[i];
            }
            System.out.println(max);
        }
        sc.close();
    }
}
// 2차원 배열 -> 알고리즘 수업 시간 chainMatrix Alg. 생각
/*
int[][] maxR = new int[N][N];
            for(int i=0; i<N; i++){
                maxR[i][i] = sc.nextInt();
                if(max < maxR[i][i])
                    max = maxR[i][i];
            }

            for(int l=1; l<N-1; l++){
                for(int i=0; i<N-l; i++){
                    int j = i+l;
                    maxR[i][j] = maxR[i][i] + maxR[i+1][j];
                    if(max < maxR[i][j])
                        max = maxR[i][j];
                    //System.out.printf("maxR[%d][%d] : %d\n", i, j, maxR[i][j]);
                    //System.out.println("max : " + max);
                }
            }
*/