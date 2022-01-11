// Hashing
// 해시 함수 : 임의의 길이의 입력 -> 고정된 길이의 출력
// 자료의 저장과 탐색
// 입력 : 영어 소문자로만 구성
// 각 알파벳에 고유 번호 부여. a=1, b=2, ...
// r=31, M=1234567891
// H = ( sigma(ai * r^i) i=0 to l-1 ) mod M
// Math.pow(31, 40) -> long 범위 벗어남

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BJ_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        long ans=0, r = 1;
        int M = 1234567891;

        // mod 연산의 성질
        // (A + B) mod M = { (A mod M) + (B mod M) } mod M
        // (A * B) mod M = { (A mod M) * (B mod M) } mod M
        // ( sigma(ai * r^i) i=0 to l-1 ) mod M
        // ( ai * r^i mod M 들의 합 ) mod M
        // 각 ai * r^i mod M = ( ai mod M * r^i mod M ) mod M

        for(int i=0; i<L; i++){
            //ai * r^i mod M 들의 합
            ans += ((str.charAt(i) - 'a' + 1) * r) % M;
            // r^i mod M
            r = (r * 31) % M;
        }

        System.out.print(ans%M);
    }
}