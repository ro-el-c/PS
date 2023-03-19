// 괄호
// VPS(Valid Parenthesis String) 괄호의 모양이 바르게 구성된 문자열
// ( 나오면 count +1, ) 나오면 -1.
// 단, count 값이 0보다 작아지면 열린 괄호보다 닫힌 괄호가 많다는 뜻이므로 바로 return false


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9012 {
    public static boolean isRightParenthesis(String str){
        int cnt=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(')
                cnt += 1;
            else if(str.charAt(i) == ')')
                cnt -= 1;
            if(cnt < 0)
                return false;
        }

        return cnt == 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T;
        String str;

        T = Integer.parseInt(bf.readLine());

        for(int i=0; i<T; i++){
            if(isRightParenthesis(bf.readLine()))
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }

        System.out.print(sb);
    }
}