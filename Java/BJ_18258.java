// 큐 2

// Queue 인터페이스 선언 후 라이브러리 사용 할 경우
// back() 역할의 메소드가 없다.

// Deque 또는 LinkedList 인터페이스 사용

// LinkedList 는 노드(객체)를 참조하여 연결하는 방식
// ArrayDeque 는 내부에 Object[] 비열을 두고, 해당 배열에 데이터를 관리한다


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BJ_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            if(order.equals("push"))
                q.offer(Integer.parseInt(st.nextToken()));

            else if(order.equals("pop")){
                if(q.isEmpty())
                    sb.append(-1);
                else
                    sb.append(q.poll());
                sb.append("\n");
            }

            else if(order.equals("size"))
                sb.append(q.size()).append("\n");

            else if(order.equals("empty")){
                if(q.isEmpty())
                    sb.append(1);
                else
                    sb.append(0);
                sb.append("\n");
            }

            else if(order.equals("front")){
                if(q.isEmpty())
                    sb.append(-1);
                else
                    sb.append(q.peekFirst());
                sb.append("\n");
            }

            else if(order.equals("back")){
                if(q.isEmpty())
                    sb.append(-1);
                else
                    sb.append(q.peekLast());
                sb.append("\n");
            }
        }

        System.out.print(sb);
    }
}
