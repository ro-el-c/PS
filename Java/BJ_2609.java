// 최대공약수와 최소공배수
// 유클리드 호제법

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2609 {
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
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a, b, result;

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        if(a<b) {
            int temp = a;
            a = b;
            b = temp;
        }

        result = gcd(a, b);
        System.out.println(result);
        System.out.print(a*b/result);
    }
}
