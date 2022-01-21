// 제로
// 잘못된 수를 부를 때마다 0을 외쳐서, 가장 최근에 재민이가 쓴 수를 지우게 시킨다.
// 모든 수를 받아 적은 후, 그 수의 합 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(bf.readLine());
        int sum=0, temp;

        for(int i=0; i<K; i++){
            temp = Integer.parseInt(bf.readLine());

            if(temp == 0)
                stack.pop();
            else
                stack.push(temp);

        }

        int size = stack.size();

        for(int i=0; i<size; i++)
            sum += stack.pop();

        System.out.println(sum);

    }
}