// 포도주 시식
// 1. 잔 선택 -> 모두 마셔야 함, 원위치로
// 2. 연속으로 놓여있는 3잔을 모두 마실 수 X
// 될 수 있는대로 많은 양의 포도주 마셔야 함

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n+1];
        int[] ans = new int[n+1];

        for(int i=1; i<=n; i++)
            arr[i] = Integer.parseInt(bf.readLine());

        ans[1] = arr[1];

        if(n>1)
            ans[2] = arr[1] + arr[2];

        for(int i=3; i<=n; i++)
            ans[i] = Math.max(ans[i-1], Math.max(ans[i-3] + arr[i-1] + arr[i], ans[i-2] + arr[i]));

        System.out.print(ans[n]);
    }
}