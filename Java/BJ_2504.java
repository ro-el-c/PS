// 괄호의 값

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class BJ_2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        boolean flag = true;
        int mid = 1;
        int result = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {

                case '(':
                    stack.push('(');
                    mid *= 2;
                    break;

                case '[':
                    stack.push('[');
                    mid *= 3;
                    break;

                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        flag = false;
                        break;
                    }

                    if (str.charAt(i - 1) == '(')
                        result += mid;
                    stack.pop();
                    mid /= 2;
                    break;

                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        flag = false;
                        break;
                    }

                    if (str.charAt(i - 1) == '[')
                        result += mid;
                    stack.pop();
                    mid /= 3;
                    break;
            }
            if(!flag)
                break;
        }

        if(!flag || !stack.isEmpty())
            System.out.print(0);
        else
            System.out.print(result);
    }
}