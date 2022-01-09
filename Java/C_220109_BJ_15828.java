// Router

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class C_BJ_15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<>();

        int que_size = Integer.parseInt(bf.readLine());

        int data;
        while((data = Integer.parseInt(bf.readLine())) != -1){
            // 양의 정수 입력
            // 0 패킷 차나 처리
            if(data == 0)
                que.poll();
            else if(data > 0 && que.size() < que_size)
                que.offer(data);
        }

        if(que.isEmpty())
            System.out.print("empty");
        else {
            while (!que.isEmpty())
                sb.append(que.remove() + " ");
        }

        System.out.println(sb);
    }
}