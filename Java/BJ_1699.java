// 제곱수의 합

// dp
// arr[i] = max(arr[i], arr[i - j^2] + 1 (j는 1부터 j^2이 i 보다 작거나 같을 때까지)
// 이 때, 마지막 +1 은 arr[i - j^2] 에 j*j의 연산 1번을 더하는 것

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1699 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[100001];

        for(int i=0; i<=100000; i++)
            arr[i] = i;

        for(int i=4; i<=100000; i++){
            for(int j=1; j*j<=i; j++){
                if(arr[i] > arr[i - j*j] + 1)
                    arr[i] = arr[i - j*j] + 1;
            }
        }

        System.out.print(arr[N]);


    }
}