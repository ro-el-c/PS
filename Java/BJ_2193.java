// 이친수
// : 이진수 중에, 특별한 성질을 갖는 수
// N 자리수 이친수 개수 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        long[][] arr = new long[N+1][2];

        arr[1][0] = 0;
        arr[1][1] = 1;

        for(int i=2; i<=N; i++){
            arr[i][0] = arr[i-1][0] + arr[i-1][1];
            arr[i][1] = arr[i-1][0];
        }

        System.out.print(arr[N][0] + arr[N][1]);

    }
}