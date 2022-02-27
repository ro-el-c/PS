// 가장 긴 증가하는 부분 수열 (LIS : Longest Increasing Subsequence)
// 1. 완전 탐섹 (2^N)
// 2. DP (N^2)
// 3. 이분 탐색 (NlogN)

// 이분 탐색 binary search

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ_12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        list.add(0);

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > list.get(list.size() - 1))
                // list의 마지막 값이 현재 값보다 작으면, 오름차순에 해당하므로 추가
                list.add(arr[i]);
            else{ // list의 마지막 값이 현재 값보다 크거나 같으면, 오름차순이 아니므로
                  // 이분탐색을 통해 들어갈 자리를 구하고, 그 곳의 값을 현재 값으로 다시 세팅
                int lo=0, hi=list.size()-1;

                while(lo < hi){
                    int mid = (lo + hi) / 2;
                    if(list.get(mid) >= arr[i]){
                        hi = mid;
                    }else{
                        lo = mid + 1;
                    }
                }
                list.set(hi, arr[i]);
            }
        }

        // 더 긴 수열이 등장하지 않으면, list의 길이는 유지됨
        // == list의 size가 항상 최댓값
        // 처음에 0을 추가했으므로, size-1 출력
        System.out.println(list.size() - 1);
    }
}
