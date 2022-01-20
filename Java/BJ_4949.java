// 균형잡힌 세상

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_4949 {
    public static String isBalance(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[')
                stack.push(ch);

            else if(ch == ')'){
                if(stack.isEmpty() || stack.peek() != '(')
                    return "no";

                stack.pop();
            }

            else if(ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[')
                    return "no";

                stack.pop();
            }
        }

        if(stack.isEmpty())
            return "yes";
        else
            return "no";


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = bf.readLine();

            if(str.equals("."))
                break;

            sb.append(isBalance(str)).append("\n");
        }

        System.out.print(sb);
    }
}