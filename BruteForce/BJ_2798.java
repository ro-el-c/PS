// 블랙잭
// 카드 합이 21을 넘지 않는 한도 내에서, 카드 합을 최대한 크게
// NEW RULE !!!!!!!!
// 딜러 N장의 카드 숫자 보이도록, 숫자 M을 크게 외침
// 플레이어 : 제한 시간 내 N장 중 3장 고르기
// M을 넘지 않으면서, M에 최대한 가까운 카드 3장의 합 출력

// 브루트포스

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class BJ_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N, M, max=0, tmp;
        int[] arr;

        st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int l=j+1; l<N; l++){
                    tmp = arr[i] + arr[j] + arr[l];
                    if(tmp <= M && tmp > max)
                        max = tmp;
                }
            }
        }

        System.out.println(max);



    }
}
