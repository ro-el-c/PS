// 나무 자르기
// 나무 M미터 필요
// 절단기에 높이 H 지정
// 나무에서 잘려나간 윗 부분을 가져감
// 적어도 M 미터의 나무를 가져가기 위해 설정할 수 있는 높이의 최댓값 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N, M;
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        long[] height = new long[N];

        st = new StringTokenizer(bf.readLine());
        long max=0;
        for(int i=0; i<N; i++){
            height[i] = Integer.parseInt(st.nextToken());
            if(max < height[i])
                max = height[i];
        }

        long min=0, mid=0;

        while(min <= max){
            mid = (min + max) / 2;
            long meter=0;

            for(int i=0; i<N; i++){
                if(height[i] >= mid)
                    meter += height[i] - mid;
            }

            if(meter < M)
                max = mid - 1;
            else
                min = mid + 1;
        }

        System.out.println(max);
    }
}