// 랜선 자르기
// K 개의 랜선으로 N개의 같은 길이 랜선 만들기
// 만들 수 있는 랜선의 길이 중 최댓값 출력

// 랜선 길이로 이분 탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int K, N;
        long hi=0;

        K = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        N = Integer.parseInt(st.nextToken());

        // 현재 가지고 있는 막대 중 가장 길 막대의 길이 hi에 저장 (범위 설정을 위함)
        for(int i=0; i<K; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            if (hi < arr[i])
                hi = arr[i];
        }

        long lo=1, mid=0; // 랜선의 길이 자연수

        while(lo <= hi){
            long cnt=0;
            mid = (lo + hi) / 2;

            for(int i=0; i<K; i++){
                cnt += arr[i]/mid;
            }

            if(cnt < N)
                hi = mid-1;
            else
                lo = mid+1;
        }

        System.out.print(hi);


    }
}