// 연속합

// temp = max(직전까지의 최댓값 + 현재 값, 현재 값)
// answer = max(temp, answer) -> 갱신 및 유지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int temp=arr[0], max = arr[0];
        for(int i=1; i<N; i++){
            temp = Math.max(temp+arr[i], arr[i]);
            if(temp > max)
                max = temp;
        }

        System.out.print(max);
    }
}