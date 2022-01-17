// 통계학
// N(홀수)개의 수 대표 기본 통계값
// 1. 산술 평균 : (N개 수의 합) / N
// 2. 중앙값 : N개 오름차순 -> 중앙값
// 3. 최빈값 : 가장 많이 나타나는 값
// 4. 범위 : 최댓값 - 최솟값
// 1~4 출력

// 주석 : 내 풀이
// main 문 : counting sort 이용

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum=0;

        int N = Integer.parseInt(bf.readLine());
        int[] count = new int[8001]; // 범위 -4000 ~ 4000
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(bf.readLine());
            sum += temp;
            count[temp+ 4000] += 1; // 최빈값을 구하기 위하여 각 숫자에 대한 입력 횟수 저장

            if(max < temp)
                max = temp;
            if(min > temp)
                min = temp;
        }

        int cnt=0;
        int max_mode=0, mode=5000, mid=5000;
        boolean first=false;

        for(int i=min+4000; i<=max+4000; i++){
            if(count[i] > 0){
                // 중앙값
                if(cnt < (N+1)/2){
                    cnt += count[i];
                    mid = i-4000;
                }

                // 최빈값
                if(max_mode < count[i]){
                    max_mode = count[i];
                    mode = i-4000;
                    first = true;
                }
                else if(max_mode == count[i] && first){
                    first = false;
                    mode = i-4000;
                }
            }
        }

        /* 산술 평균 */
        sb.append((int)Math.round((double)sum/N) + "\n");

        /* 중앙값 */
        sb.append(mid + "\n");

        /* 최빈값 */
        sb.append(mode + "\n");

        /* 범위 */
        sb.append(max-min);

        System.out.print(sb);
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;



        Arrays.sort(arr);

        *//* 산술 평균 *//*
        avg = (int)Math.round((double)sum/N);
        sb.append(avg + "\n");


        *//* 중앙값 *//*
        mid = arr[N/2];
        sb.append(mid + "\n");

        *//* 최빈값 *//*
        ArrayList<Integer> li = new ArrayList<>();
        int max = index[0];
        for(int i=1; i<8001; i++){
            if(max < index[i])
                max = index[i];
        }
        for(int i=0; i<8001; i++){
            if(index[i] == max)
                li.add(i-4000);
        }

        li.sort(Comparator.naturalOrder());

        if(li.size()==1){
            most = li.get(0);
            sb.append(most + "\n");
        }
        else{
            most = li.get(1);
            sb.append(most + "\n");
        }

        *//* 범위 *//*
        range = arr[N-1] - arr[0];
        sb.append(range);

        System.out.print(sb);*/