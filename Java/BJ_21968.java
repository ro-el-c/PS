// 선린의 터를
// 3^k 꼴이 최대 한 번씩 더해진 자연수
// N번째 작은 선린의 터 출력

// 최대 한 번 사용하고, 더할 때 작은 수끼리부터 더해야 함
// 떠라서 이진법 이용 (N을 2진법으로 바꾼 후 3^k * (0 또는 1)로 계산)
//   -> 0과 1로만 나타내기 때문에 최대 한 번 사용 만족
//   -> N번째 최소 숫자 만족

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_21968 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());

        for(int i=0; i<T; i++){
            long trit = 1, ans=0;
            long n = Long.parseLong(bf.readLine());
            String binary = Long.toBinaryString(n);

            for(int j=binary.length()-1; j>=0; j--){
                long temp = Long.parseLong(Character.toString(binary.charAt(j)));
                ans += temp*trit;
                trit *= 3;
            }

            sb.append(ans + "\n");
        }

        System.out.println(sb);
    }
}