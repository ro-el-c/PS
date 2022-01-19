// 떡 먹는 호랑이
// D째 날에 K개 떡을 줌
// A : 처음 만날 날 준 떡의 개수
// B : 그 다음 날 준 떡의 개수
// ex. D = 6, K = 41
// -> 2, 7, 9, 16, 25, 41
// 2 \n 7 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2502 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int D, K;
        D = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int a1_1=1, a1_2=1, a1=0;
        int a2_1=1, a2_2=2, a2=0;

        if(D==3){
            System.out.printf("%d\n%d", 1, K-1);
            System.exit(0);
        }
        if(D==4){
            a1=1;
            a2=2;
        }
        else{
            for(int i=5; i<=D; i++){
                a1 = a1_1 + a1_2;
                a1_1 = a1_2;
                a1_2 = a1;

                a2 = a2_1 + a2_2;
                a2_1 = a2_2;
                a2_2 = a2;
            }
        }

        for(int i=1; ; i++){
            if((K - i*a1) % a2 == 0){
                sb.append(i + "\n" + (K - i*a1) / a2);
                break;
            }
        }
        System.out.print(sb);
    }
}