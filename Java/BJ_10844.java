// 쉬운 계단 수
// 계단 수 : 인접한 모든 자리의 차이가 1인 수
// 길이 N인 계단 수 개수 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        long[][] arr = new long[N+1][10];

        for(int i=1; i<10; i++)
            arr[1][i] = 1;

        for(int i=2; i<=N; i++){
            for(int j=0; j<10; j++){
                if(j==0)
                    arr[i][j] = arr[i-1][1]%1000000000;
                else if(j==9)
                    arr[i][j] = arr[i-1][8]%1000000000;
                else
                    arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1])%1000000000;
            }
        }

        long sum=0;

        for(int i=0; i<10; i++)
            sum += arr[N][i];

        System.out.print(sum%1000000000);

    }
}