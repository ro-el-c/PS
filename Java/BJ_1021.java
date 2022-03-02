// 회전하는 큐
// 덱 (deque)
// 타겟의 인덱스와 중간 지점의 인덱스를 비교하여
// 앞에서 제거할지 뒤에서 제거할지 결정
// 계산 과정 count

// ArrayList -> indexOf 메소드로 타겟 숫자의 인덱스 구함

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> deque = new LinkedList<>();
        int cnt=0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=1; i<=N; i++)
            deque.offer(i);

        st = new StringTokenizer(br.readLine());
        int[] find = new int[M];
        for(int i=0; i<M; i++)
            find[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<M; i++){
            int targetIdx = deque.indexOf(find[i]);
            int midIdx = (deque.size()-1) / 2;

            if(targetIdx <= midIdx){
                for(int j=0; j<targetIdx; j++){
                    deque.offer(deque.pollFirst());
                    cnt++;
                }
            }
            else{
                for(int j=0; j<deque.size()-targetIdx; j++){
                    deque.offerFirst(deque.pollLast());
                    cnt++;
                }
            }
            deque.pollFirst();
        }

        System.out.print(cnt);
    }
}