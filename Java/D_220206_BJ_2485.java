// 가로수
// 간격들의 최대공약수
// 유클리드 호제법

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class D_220206_BJ_2485 {
    public static int gcd(int a, int b){
        if(b==0)
            return a;
        while(true){
            int x = a%b;
            if (x==0)
                return b;
            else{
                int temp = b;
                b = a%b;
                a = temp;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        int[] interval = new int[N-1];

        for(int i=0; i<N; i++)
            arr[i] = Integer.parseInt(bf.readLine());

        for(int i=1; i<N; i++){
            interval[i-1] = arr[i]-arr[i-1];
        }

        int gcd = interval[0];

        for(int i=1; i<N-1; i++){
            if(interval[i] > gcd)
                gcd = gcd(interval[i], gcd);
            else
                gcd = gcd(gcd, interval[i]);
        }

        int cnt=0;

        for(int i=1; i<N; i++){
            cnt += (arr[i]-arr[i-1]) / gcd - 1;
        }

        System.out.println(cnt);

    }
}