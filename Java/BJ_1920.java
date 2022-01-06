// 수 찾기
// N개의 숫자가 주어진다. -> A 배열이라고 하자
// M개의 숫자가 주어지면, 각각 A 배열 속 존재 여부 출력
// 정렬 후, 이진탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1920 {
    public static boolean binarySearch(int[] arr, int x){
        int lo=0, hi=arr.length-1;

        while(lo <= hi){
            int mid=(lo+hi)/2;

            if(x < arr[mid]){
                hi = mid-1;
            }
            else if(x > arr[mid]){
                lo = mid+1;
            }
            else{
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N, M;

        N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        M = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<M; i++){
            int x = Integer.parseInt(st.nextToken());
            if(binarySearch(arr, x))
                sb.append(1 + "\n");
            else
                sb.append(0 + "\n");
        }
        System.out.print(sb);
    }
}