// 거스름돈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] money = {500, 100, 50, 10, 5, 1};
        int pay = 1000 - Integer.parseInt(bf.readLine());
        int cnt=0;

        for(int i=0; i<6; i++){
            if(pay/money[i]>0){
                cnt += pay/money[i];
                pay %= money[i];
            }
        }

        System.out.print(cnt);
    }
}