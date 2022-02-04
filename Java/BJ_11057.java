// 오르막 수
// 수의 모든 자리가 오름차순을 이루는 수
// 인접한 수가 같은 수여도 된다
// ex. 2234, 3678, 1119

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11057 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[][] arr = new int[N+1][10];
        for(int i=0; i<10; i++)
            arr[1][i] = 1;

        for(int i=2; i<=N; i++){
            for(int j=0; j<10; j++){
                for(int k=0; k<=j; k++)
                    arr[i][j] += arr[i-1][k];

                arr[i][j] %= 10007;
            }
        }

        int sum=0;
        for(int i=0; i<10; i++)
            sum += arr[N][i];

        System.out.print(sum % 10007);

    }
}