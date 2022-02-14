// 문자열 분석

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str="";

        while((str = br.readLine()) != null){
            int small=0, upper=0, num=0, space=0;

            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);

                if('a' <= c && c <= 'z')
                    small++;
                else if('A' <= c && c <= 'Z')
                    upper++;
                else if('0' <= c && c <= '9')
                    num++;
                else
                    space++;
            }

            System.out.println(small + " " + upper + " " + num + " " + space);
        }
    }
}