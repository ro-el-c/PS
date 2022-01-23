// 두부 게임
// N명 원모양
// 주최자(A) 기준 M(1보다 큰 홀수)모 게임
// 주최자 뒷 번호 차례대로 M/2+2 ~ M모
// 주최자 앞 1 ~ M/2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C_BJ_14564 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N, M, A;
        N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        for(int i=1; i<=N; i++)
            arr[i] = i;

        M = Integer.parseInt(st.nextToken());
        int mid = M/2+1;

        A = Integer.parseInt(st.nextToken());

        while(true){
            int n = Integer.parseInt(bf.readLine());
            int t = n-mid;

            if(t == 0) {
                sb.append(0);
                System.out.print(sb);
                System.exit(0);
            }

            int index;

            if(n-mid > 0){
                if(A+t > N)
                    index = A+t-N;
                else{
                    index = A+t;
                }

                sb.append(arr[index] + "\n");
                A = arr[index];
            }

            else{
                if(A+t <= 0)
                    index = N+A+t;
                else{
                    index = A+t;
                }

                sb.append(arr[index] + "\n");
                A = arr[index];
            }
        }

    }
}