// 조합 0의 개수
// nCm : n! / ((n-m)! * m!)
// 팩토리얼 0의 개수 이용
// 분모와 분자에 속하는 각 팩토리얼 값을 소인수분해 한 결과,
// 2와 5의 개수를 구하여
// 분자의 2, 5의 개수에서 분모의 2, 5의 개수를 뺀다.
// 구한 두 수 중 작은 수가 남는 0의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2004 {
    public static long countTwo(long x){
        long num=0;
        while(x>=2){
            num += x/2;
            x /= 2;
        }
        return num;

    }
    public static long countFive(long x){
        long num=0;
        while(x>=5){
            num += x/5;
            x /= 5;
        }
        return num;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());

        long countTwo=0, countFive=0;
        countTwo += countTwo(N) - countTwo(M) - countTwo(N-M);
        countFive += countFive(N) - countFive(M) - countFive(N-M);

        System.out.print(Math.min(countTwo, countFive));
    }
}