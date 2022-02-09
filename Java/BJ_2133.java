// 타일 채우기
// 3xN 크기의 벽을 2x1, 1x2 크기의 타일로 채우는 경우의 수 출력

// dp

// arr[0] = 1
// n=2k+1 => arr[n] = 0 (k>=1)

// n>=4 일 때, 매번 예외 2개씩 추가

// 그리고 그 경우에 대하여 왼쪽에 n-4, n-6, ... 의 타일들을 배치할 수 있는 경우의 수를 고려해서 점화식을 세우면,
// arr[n] = arr[n-2] * arr[2](=3)  +  arr[n-4]*2(예외 2가지 경우에 대하여) + arr[n-6]*2 + ... + arr[0]*2 이 된다.

// +)
// n=2m (m>=1) 일 때,
// arr[n-2] * arr[2](=3) : 3*{2(m-1)} 의 타일 옆에 3*2 타일이 붙는 경우의 수
// arr[n-4]*2 + arr[n-6]*2 + ... + arr[0]*2
// : n>=4 일 때부터 추가되는 2가지의 예외와, 그 예외들 옆에 배치되는
//   3*(n-i) 타일 경우의 수 arr[n-i] (i=4, 6, 8, ... , n) 곱들의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2133 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[31];
        arr[0] = 1;
        arr[2] = 3;

        for(int i=4; i<31; i++) {
            arr[i] = arr[i-2] * arr[2];
            for(int j=4; j<=i; j++){
                arr[i] += arr[i-j]*2;
                j++;
            }
            i++;
        }

        System.out.print(arr[N]);
    }
}