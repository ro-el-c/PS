// 수열과 쿼리 38
// 1 x : A의 가장 뒤에 x 추가
// 2 x : A에서 x를 제거
//       A에 x가 두 개 이상 있는 경우에는 가장 앞에 있는 하나만 제거
//       (항상 A에 x가 있는 쿼리만 주어짐)
// 3: 모든 원소를 더한 값 출력
// 4: 모든 원소를 XOR한 값 출력

// xor 한 번 더 하면, 그 값 없이 xor 한 결과과 동일하므로
// 2 x 가 나오면 누적(?) xor 값에 다시 xor 연산 수행
// 2 x 에서는 A 에 꼭 있는 값이 x로 주어지므로, sum 에 더하고 빼기


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_18917 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int Q = Integer.parseInt(bf.readLine());

        long sum=0, xor=0;
        for(int i=0; i<Q; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int query = Integer.parseInt(st.nextToken());

            if(query == 1){
                int num = Integer.parseInt(st.nextToken());
                sum += num;
                xor ^= num;
            }
            else if(query == 2){
                int num = Integer.parseInt(st.nextToken());
                sum -= num;
                xor ^= num;
            }
            else if(query == 3){
                sb.append(sum + "\n");
            }
            else{
                sb.append(xor + "\n");
            }
        }

        System.out.print(sb);
    }
}