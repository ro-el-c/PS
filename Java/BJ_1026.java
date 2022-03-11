// 보물

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        Integer[] arrA = new Integer[n];
        Integer[] arrB = new Integer[n];

        for(int i=0; i<n; i++){
            arrA[i] = Integer.parseInt(st.nextToken());
            arrB[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB, Collections.reverseOrder());

        int sum=0;
        for(int i=0; i<n; i++){
            sum += arrA[i]*arrB[i];
        }

        System.out.print(sum);
    }
}