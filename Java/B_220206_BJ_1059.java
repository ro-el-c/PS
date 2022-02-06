// 좋은 구간

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_220206_BJ_1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(bf.readLine());
        int[] arr = new int[L];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<L; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int n = Integer.parseInt(bf.readLine());

        int lo=0, hi=Integer.MAX_VALUE;
        boolean can = true;
        for(int i=0; i<L; i++){
            if(arr[i] > n)
                hi = Math.min(arr[i], hi);
            else if(arr[i]<n)
                lo = Math.max(arr[i], lo);
            else{
                can=false;
                break;
            }
        }

        if(!can)
            System.out.print(0);
        else
            System.out.print(hi-lo-2 + (n-lo-1)*(hi-n-1));

    }
}