// 등수 매기기
// 불만도 : | 예상 등수 - 실제 등수 |
// 최소 불만도 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_2012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++)
            arr[i] = Integer.parseInt(bf.readLine());

        Arrays.sort(arr);
        long sum=0;

        for(int i=0; i<N; i++)
            sum += Math.abs(arr[i]-(i+1));

        System.out.print(sum);
    }
}