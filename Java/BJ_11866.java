// 요세푸스 문제 0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class BJ_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int N, K;
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++)
            queue.add(i+1);

        while(queue.size() > 0){
            for(int i=0; i<K-1; i++){
                queue.offer(queue.poll());
            }

            sb.append(queue.poll() + ", ");
        }

        sb.delete(sb.length()-2, sb.length());
        sb.append(">");
        System.out.print(sb);
    }
}