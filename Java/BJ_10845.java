// 큐
// 정수 저장 큐 구현, 입력의 명령 처리
// push X: 정수 X를 큐에 넣는 연산이다.
// pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// size: 큐에 들어있는 정수의 개수를 출력한다.
// empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
// front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BJ_10845 {
    public static class Queue {
        int[] queue;
        int front = 0; // 가장 앞을 가리키는 수
        int back = 0; // 가장 마지막을 가리키는 수
        int q_size = 0;

        public Queue(int n){
            queue = new int[n];
        }

        public void push (int x){
            queue[back++] = x;
            q_size++;
        }

        /* 가장 앞의 정수를 빼고, 출력  */
        public int pop () {
            if(q_size == 0) return -1;
            int tmp = queue[front++];
            q_size--;
            return tmp;
        }

        public int size () {
            return q_size;
        }

        public int empty () {
            if(q_size == 0) return 1;
            else return 0;
        }

        /* 가장 앞의 정수 출력  */
        public int front () {
            if(q_size == 0) return -1;
            return queue[front];
        }

        /* 가장 뒤의 정수 출력  */
        public int back () {
            if(q_size == 0) return -1;
            else return queue[back-1];
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        Queue q = new Queue(N);

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String str = st.nextToken();

            if(str.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                q.push(x);
            }
            else if(str.equals("pop"))
                System.out.println(q.pop());
            else if(str.equals("size"))
                System.out.println(q.size());
            else if(str.equals("empty"))
                System.out.println(q.empty());
            else if(str.equals("front"))
                System.out.println(q.front());
            else if(str.equals("back"))
                System.out.println(q.back());
            else
                System.out.println("Wrong Order");
        }
    }
}