// 쇠막대기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cnt=0, result=0;
        String str = bf.readLine();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(')
                cnt += 1;
            else{
                cnt -= 1;

                String temp = str.substring(i-1, i+1);
                if(temp.equals("()"))
                    result += cnt;
                else
                    result += 1;
            }
        }

        System.out.print(result);
    }
}