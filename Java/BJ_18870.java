// 좌표 압축

// sorting, hashMap
// hashMap - 객체 탐색 O(1)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        int[] sort = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++)
            arr[i] = sort[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(sort);

        HashMap<Integer, Integer> map = new HashMap<>();
        int r=0;
        for(int num:sort){
            if(!map.containsKey(num)){
                map.put(num, r);
                r++;
            }
        }

        for(int num:arr){
            sb.append(map.get(num) + " ");
        }

        System.out.print(sb);
    }
}