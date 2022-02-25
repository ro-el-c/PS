// 최소 힙

// 큐 (Queue)
// : 선입선출

// 우선순위 큐 (Priority Queue) ; 힙 자료구조로 구현
// : 들어간 순서에 상관없이 우선순위가 높은 데이터가 먼저 나감
// - list or LinkedList 로 구현 => 삽입 과정에서 최악의 경우 O(n) / 삭제 O(1)
// - heap 으로 구현 => 삽입, 삭제 시 부모와 자식 간의 비교만. 최악의 경우 삽입, 삭제 O(log n)

// Java 에서 Priority Queue 인터페이스는 기본적으로 최소 힙으로 설정되어 있음.
// 최대 힙으로 이용하고 싶으면
// PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BJ_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

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
