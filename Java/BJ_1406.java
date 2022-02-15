// 에디터

// L : 커서 왼쪽으로 한 캄 (커서가 문장의 맨 앞이면 무시됨)
// D : 커서 오른쪽으로 한 칸 (커서가 문장의 맨 뒤면 무시된)
// B : 커서 왼쪽 문자 삭제 (커서가 문장의 맨 앞이면 무시됨).
//      -> 삭제로 인해 커서가 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로
// P $ : $ 라는 문자를 커서 왼쪽에 추가

// stack 의 push, pop 연산 : O(1)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        String str = br.readLine();
        for(int i=0; i<str.length(); i++)
            left.push(str.charAt(i));

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String temp = br.readLine();
            char c = temp.charAt(0);

            if(c == 'L'){
                if(!left.isEmpty())
                    right.push(left.pop());
            }
            else if(c == 'D'){
                if(!right.isEmpty())
                    left.push(right.pop());
            }
            else if(c == 'B'){
                if(!left.isEmpty())
                    left.pop();
            }
            else{
                left.push(temp.charAt(2));
            }
        }

        while(!left.isEmpty())
            right.push(left.pop());

        while(!right.isEmpty())
            sb.append(right.pop());

        System.out.print(sb);
    }
}