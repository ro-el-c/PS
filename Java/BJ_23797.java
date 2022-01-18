// 개구리
// 개구리 울음소리는 K와 P가 번갈아서 나옴
// 문자열 S -> 최소 몇 마리 개구리가 울고 있는지 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_23797 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int last_k=0, last_p=0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'K'){
                if(last_p == 0)
                    last_k++;
                else{
                    last_p--;
                    last_k++;
                }
            }
            if(ch == 'P'){
                if(last_k == 0)
                    last_p++;
                else{
                    last_k--;
                    last_p++;
                }
            }
        }
        System.out.print(last_k+last_p);
    }
}