// 2xn 타일링 2
// 2 x n 크기의 직사각형을 1x2, 2x1, 2x2 타일로 채우는 방법의 수 출력

// dp
// arr[i] = arr[i-1] + 2*arr[i-2]
// n-1 의 타일에 (2*1 타일) +  n-2의 타일에 (1*2 타일, 2*2 타일)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] arr = new int[1001];

        arr[1] = 1;
        arr[2] = 3;

        for(int i=3; i<=1000; i++)
            arr[i] = (arr[i-1] + 2*arr[i-2]) % 10007;

        System.out.print(arr[N]);
    }
}