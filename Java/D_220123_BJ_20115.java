// 에너지 드링크
// 1. 임의의 서로 다른 두 드링크
// 2. 한 쪽 -> 다른 쪽에 모두 부음. 절반 흘림
// 3. 남은 빈 드링크 버림
// 4. 1~3 -> 드링크 하나 남을 때까지 반복

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class D_BJ_20115 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        Integer[] drink = new Integer[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++)
            drink[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(drink, Collections.reverseOrder());

        double sum = drink[0];
        for(int i=1; i<N; i++){
            sum += (double)drink[i]/2;
        }

        System.out.print(sum);
    }
}
