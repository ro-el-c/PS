// AC

// 덱

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BJ_5430 {
    static StringBuilder sb = new StringBuilder();

    public static void AC(Deque<Integer> dq, String od){
        char[] orderArr = od.toCharArray();
        boolean reverse = false;

        for(char x : orderArr){
            if(x == 'R'){
                reverse = !reverse;
                continue;
            }

            if(!reverse){
                if(dq.pollFirst() == null){
                    sb.append("error").append("\n");
                    return;
                }
            }

            else{
                if( dq.pollLast() == null){
                    sb.append("error").append("\n");
                    return;
                }
            }
        }

        sb.append("[");

        if(dq.size() > 0){
            if(!reverse){
                sb.append(dq.pollFirst());
                while(!dq.isEmpty())
                    sb.append(",").append(dq.pollFirst());
            }
            else{
                sb.append(dq.pollLast());
                while(!dq.isEmpty())
                    sb.append(",").append(dq.pollLast());
            }
        }

        sb.append("]").append("\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque;
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String order = br.readLine();

            int n = Integer.parseInt(br.readLine());

            String temp = br.readLine();
            String[] tempArr = temp.substring(1, temp.length()-1).split(",");

            deque = new ArrayDeque<>();

            for(int j=0; j<n; j++)
                deque.offer(Integer.parseInt(tempArr[j]));

            AC(deque, order);
        }

        System.out.print(sb);
    }
}