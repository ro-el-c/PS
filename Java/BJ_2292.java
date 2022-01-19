// 벌집

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        if(N==1){
            System.out.print(1);
            System.exit(0);
        }

        int cnt=1, max=1;

        while(max < N){
            max += 6*cnt;
            cnt++;
        }

        System.out.print(cnt);
    }
}