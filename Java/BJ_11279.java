// 최대 힙

// BJ_1927 에서 Priority Queue 선언 부분만 수정

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Collections;

public class BJ_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(br.readLine());

            if(temp == 0){
                if(pq.isEmpty())
                    sb.append(0);
                else
                    sb.append(pq.poll());
                sb.append("\n");
            }
            else{
                pq.offer(temp);
            }
        }

        System.out.print(sb);
    }
}
