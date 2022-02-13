// 주유소
// 제일 왼쪽에서 제일 오른쪽으로 이동할 때
// 최소 주유 비용 출력
// 리터 당 가격이 이전 도시보다 낮으면 그 가격으로 다음 도시까지 거리만큼 주유,
//                            높으면 이전 도시 가격으로 다음 도시까지의 거리만큼 주유

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        long[] intv = new long[N-1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N-1; i++)
            intv[i] = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++)
            arr[i] = Long.parseLong(st.nextToken());

        long min=arr[0], sum=min*intv[0];

        for(int i=1; i<N-1; i++){
            if(min>arr[i])
                min = arr[i];

            sum += min * intv[i];
        }

        System.out.print(sum);
    }
}