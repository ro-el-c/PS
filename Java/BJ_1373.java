// 2진수 8진수
// 2진수 주어졌을 때, 8진수로 변환 -> 출력

// 8 = 2^3
// 오른쪽부터 3글자씩 끊어서 8의 0승, 1승, ... 곱한 수가 8진수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        if(str.length()%3 == 1)
            sb.append(str.charAt(0));
        else if(str.length()%3==2)
            sb.append((str.charAt(0)-'0') * 2 + (str.charAt(1)-'0'));


        for(int i=str.length()%3; i<str.length(); i+=3)
            sb.append((str.charAt(i)-'0') * 4 + (str.charAt(i+1)-'0') * 2 + (str.charAt(i+2)-'0'));


        System.out.print(sb);
    }
}