// 세탁소 사장 동혁
// 쿼터 0.25 달러 25 센트
// 다임 0.1 달러 10
// 니켈 0.05 달러 5
// 페니 0.01 달러 1

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A_220123_BJ_2720 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());
        int[] arr = {25, 10, 5, 1};

        for(int i=0; i<T; i++){
            int back = Integer.parseInt(bf.readLine());

            for(int j=0; j<4; j++){
                int ans=0;
                if(back/arr[j] > 0){
                    ans += back/arr[j];
                    back %= arr[j];
                }
                sb.append(ans+" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
