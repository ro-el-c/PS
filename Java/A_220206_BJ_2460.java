// 지능형 기차 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_220206_BJ_2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int sum=0, max_sum=0;

        for(int i=0; i<10; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            sum -= Integer.parseInt(st.nextToken());
            sum += Integer.parseInt(st.nextToken());

            if(max_sum < sum)
                max_sum = sum;
        }

        System.out.print(max_sum);
    }
}