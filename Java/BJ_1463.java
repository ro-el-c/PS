// 1로 만들기
// 1. 3으로 나누어 떨어지면, 3으로 나누기
// 2. 2로 나누어 덜어지면, 2로 나누기
// 3. 1을 뺀다

// DP

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[1000001];
        arr[1]=0;
        arr[2]=1;
        arr[3]=1;

        for(int i=4; i<1000001; i++){
            int min=Integer.MAX_VALUE;

            if(i%3==0)
                min = Math.min(arr[i/3], min);

            if(i%2==0)
                min = Math.min(arr[i/2], min);

            arr[i] = Math.min(arr[i-1], min) + 1;
        }

        int N = Integer.parseInt(bf.readLine());

        System.out.print(arr[N]);

    }
}