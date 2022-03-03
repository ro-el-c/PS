// 수열의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1024 {
    static int N,L;
    static int s,e;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        int sum = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<=N; i++) {
            sum += i;

            while(sum > N) {
                sum -= start;
                start++;
            }

            if(sum == N && i-start+1 >= L) {
                if(min > i-start+1) {
                    s = start;
                    e = i;
                    min = i-start+1;
                }

                if(i-start+1 == 1)
                    break;
            }
        }

        if(sum-s == N && e-s+1 > L)
            s++;

        if(e-s+1 > 100 || min == Integer.MAX_VALUE) {
            System.out.println(-1);
        }
        else {
            for (int i=s; i<=e; i++) {
                System.out.print(i + " ");
            }
        }
    }
}