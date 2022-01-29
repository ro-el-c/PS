// 2xn 타일링
// 2 x n 크기의 직사각형을 1x2, 2x1 타일로 채우는 방법의 수 출력

// dp
// 1, 2, 3, 5, 8, 13, 21, ...
// arr[i] = arr[i-1] + arr[i-2]

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] arr = new int[1001];

        arr[1] = 1;
        arr[2] = 2;

        for(int i=3; i<=1000; i++)
            arr[i] = (arr[i-1] + arr[i-2]) % 10007;

        System.out.print(arr[N]);

    }
}