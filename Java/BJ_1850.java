// 최대공약수
// 모든 자리가 1로만 이루어져있는 두 자연수 A, B의 최대공약수를 구하여라
// 주어진 두 수의 최대공약수를 구하고, 그만큼 1을 출력하면 됨.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1850 {
    public static long gcd(long a, long b){
        if(b == 0)
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a, b;
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        long x = gcd(a, b);
        for(int i=0; i<x; i++)
            sb.append("1");

        System.out.print(sb);
    }
}