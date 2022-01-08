// 덱
// Deque 구현 Double ended queue
// push_front X: 정수 X를 덱의 앞에 넣는다.
// push_back X: 정수 X를 덱의 뒤에 넣는다.
// pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// size: 덱에 들어있는 정수의 개수를 출력한다.
// empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
// front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BJ_10866 {
    static int [] arr = new int[20001];
    static int size=0, front=10000, back=10000;

    public static void push_front(int x){
        arr[front--] = x;
        size++;
    }
    public static void push_back(int x){
        arr[++back] = x;
        size++;
    }
    public static int pop_front(){
        if(size==0)
            return -1;
        size--;
        return arr[++front];
    }
    public static int pop_back(){
        if(size==0)
            return -1;
        size--;
        return arr[back--];
    }
    public static int size(){
        return size;
    }
    public static int empty(){
        if(size == 0)
            return 1;
        else
            return 0;
    }
    public static int front(){
        if(size==0)
            return -1;
        return arr[front+1];
    }
    public static int back(){
        if(size==0)
            return -1;
        return arr[back];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String temp = st.nextToken();
            if(temp.equals("push_back")){
                int x = Integer.parseInt(st.nextToken());
                push_back(x);
            }
            else if(temp.equals("push_front")){
                int x = Integer.parseInt(st.nextToken());
                push_front(x);
            }
            else if(temp.equals("pop_front"))
                sb.append(pop_front() + "\n");
            else if(temp.equals("pop_back"))
                sb.append(pop_back() + "\n");
            else if(temp.equals("size"))
                sb.append(size() + "\n");
            else if(temp.equals("empty"))
                sb.append(empty() + "\n");
            else if(temp.equals("front"))
                sb.append(front() + "\n");
            else
                sb.append(back() + "\n");
        }

        System.out.print(sb);
    }
}