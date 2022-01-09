// 쇠막대기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E_BJ_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt=0, result=0;
        String str = bf.readLine();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                sb.append("(");
                cnt += 1;
            }
            else{
                sb.append(")");
                cnt -= 1;
                String temp = sb.toString();
                if(temp.substring(temp.length()-2, temp.length()).equals("()")){
                    result += cnt;
                }
                else{
                    result += 1;
                }

            }
        }

        System.out.print(result);


    }
}