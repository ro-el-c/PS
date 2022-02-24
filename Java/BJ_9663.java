// N-Queen
// 백트래킹

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9663 {
    static int[] arr;
    static int N;
    static int cnt=0;

    public static void nQueen(int depth){
        if(depth == N){
            cnt++;
            return;
        }

        for(int i=0; i<N; i++){
            arr[depth] = i;
            if(isPossible(depth)){
                nQueen(depth + 1);
            }
        }
    }

    public static boolean isPossible(int x){
        for(int i=0; i<x; i++){
            // 같은 열 -> 불가능
            if(arr[i] == arr[x])
                return false;

            // 대각선 상 -> 불가능
            // 열 차 == 행 차
            if(Math.abs(arr[i] - arr[x]) == Math.abs(i - x))
                return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        arr = new int[N];
        nQueen(0);
        System.out.print(cnt);
    }
}