// 카드 구매하기
// N개의 카드를 구매할 때
// 카드가 1장, 2장, ..., N장 들어있는 카드팩 중 구매
// 지불해야하는 금액의 최댓값 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] pay = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++)
                pay[i] = Math.max(pay[i], pay[i-j] + arr[j]);
        }

        System.out.print(pay[n]);
    }
}
