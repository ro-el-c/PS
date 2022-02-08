// 카드

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];

        for(int i=0; i<N; i++)
            arr[i] = Long.parseLong(br.readLine());

        Arrays.sort(arr);

        long cnt=1, max=1, ans=arr[0];
        for(int i=1; i<N; i++){
            if(arr[i] == arr[i-1])
                cnt++;
            else
                cnt=1;
            if(cnt > max){
                max = cnt;
                ans = arr[i];
            }
        }

        System.out.print(ans);
    }
}