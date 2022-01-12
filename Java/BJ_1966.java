// 프린터 큐
// 1. 가장 앞에 있는 문서의 '중요도' 확인
// 2. 나머지 문서 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면,
//    인쇄하지 않고 가장 뒤에 재배지.
//    아니면 바로 인쇄

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class BJ_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T, N, M;
        T = Integer.parseInt(bf.readLine());

        for(int i=0; i<T; i++){
            int cnt=0;

            StringTokenizer st = new StringTokenizer(bf.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            // 큐에 배열로 저장 : [문서들의 처음 위치, 우선순위]
            Queue<int[]> que = new LinkedList<>();
            // 각각의 우선순위 따로 배열에 저장
            int[] priority = new int[N];

            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<N; j++){
                int tmp = Integer.parseInt(st.nextToken());
                int[] temp = {j, tmp};
                priority[j] = tmp;
                que.offer(temp);
            }

            // 우선순위 배열 정렬
            Arrays.sort(priority);
            // -> 가장 큰 값부터 비교 => 해당 문서 출력, 아니면 다시 재배치
            int x = priority.length-1;

            while(!que.isEmpty()){
                int[] temp = que.poll();

                if(temp[1] == priority[x]){
                    cnt += 1;
                    if(temp[0] == M){
                        sb.append(cnt + "\n");
                        break;
                    }
                    x--;
                }
                else{
                    que.offer(temp);
                }
            }
        }
        System.out.print(sb);

    }
}