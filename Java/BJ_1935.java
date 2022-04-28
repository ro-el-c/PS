// 후위 표기식 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Double> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        String prefix = br.readLine();

        double[] arr = new double[N];
        for(int i=0; i<N; i++)
            arr[i] = Double.parseDouble(br.readLine());

        for(int i=0; i<prefix.length(); i++){
            char ch = prefix.charAt(i);

            if(ch>='A' && ch<='Z')
                stack.push(arr[ch-'A']);
            else{
                double num2 = stack.pop();
                double num1 = stack.pop();
                double result=0.0;
                switch(ch){
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                stack.push(result);
            }
        }

        System.out.printf("%.2f", stack.pop());
    }
}
