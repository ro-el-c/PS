// 파도반 수열
// 정삼각형들이 나선 모양으로 놓여져 있을 대,
// P(N) : N 번재 삼각형의 변의 길이

// dp
// arr[i] = arr[i-1] + arr[i-5];

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long[] arr = new long[101];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 2;

        for(int i=5; i<101; i++)
            arr[i] = arr[i-1] + arr[i-5];

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++)
            sb.append(arr[Integer.parseInt(br.readLine())]).append("\n");

        System.out.print(sb);
    }
}