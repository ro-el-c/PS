// 달팽이는 올라가고 싶다
// 높이: V, 낮: +A, 밤: -B
// 정상에 도착한 후, 미끄러지지 않는다.
// 달팽이가 모두 올라가려면, 며칠이 걸리는지 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a, b, v;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        int day=0, night=0;

        int ans = (v-b) / (a-b);

        if((v-b)%(a-b) != 0)
            ans++;

        System.out.print(ans);

    }
}