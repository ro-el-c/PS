// GCD 합
// GCD : 최대공약수
// 양의 정수 n개 주어졌을 때,
// 가능한 모든 쌍의 GCD 합을 구하는 프로그램 작성

// 유클리드 호제법

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_9613 {
    public static long gcd(long a, long b){
        if(a < b){
            long temp = a;
            a = b;
            b = temp;
        }

        if(b==0)
            return a;
        while(true){
            if(a%b == 0)
                return b;
            else{
                long temp = a;
                a = b;
                b = temp%b;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            long[] arr = new long[N];
            for(int j=0; j<N; j++)
                arr[j] = Long.parseLong(st.nextToken());

            long sum=0;
            for(int j=0; j<N-1; j++){
                for(int k=j+1; k<N; k++)
                    sum += gcd(arr[j], arr[k]);
            }

            sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }
}