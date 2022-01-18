// 분해합
// 최소 생성자 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int num=0;

        for(int i=1; i<1000001; i++){
            int len = Integer.toString(i).length();
            int sum=i, temp=i;

            for(int k=0; k<len; k++){
                sum += temp%10;
                temp /= 10;
            }

            if(sum == N){
                num = i;
                break;
            }
        }

        System.out.println(num);
    }
}