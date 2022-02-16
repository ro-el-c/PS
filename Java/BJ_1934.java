// 최소공배수(LCM)
// 두 수 x, y
// LCM = x * y / GCM
// GCM : 최대공약수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1934 {
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
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A*B/gcd(A, B)).append("\n");
        }

        System.out.print(sb);
    }
}