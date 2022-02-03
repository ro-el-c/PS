// 1, 2, 3 더하기
// 정수 n 을 1, 2, 3의 합으로 나타내는 경우의 수 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[12];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for(int i=4; i<12; i++)
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        int T = Integer.parseInt(bf.readLine());

        for(int i=0; i<T; i++){
            int n = Integer.parseInt(bf.readLine());
            sb.append(arr[n] + "\n");
        }

        System.out.print(sb);
    }
}