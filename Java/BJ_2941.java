// 크로아티아 알파벳
// 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
// c=, c-, dz=, d-, lj, nj, s=, z=

import java.util.Scanner;

public class BJ_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        // 크로아티아 알파벳 종류 저장 배열

        String str = sc.next();
        sc.close();

        for(int i=0; i<croatia.length; i++){
            // 크로아티아 알파벳 종류를 저장한 배열의 각 값, 즉, 크로아티아 알파벳이 입력받은 문자열에 포함되면 숫자 1로 치환
            if(str.contains(croatia[i]))
                str = str.replace(croatia[i], "1");
        }
        System.out.print(str.length());
    }
}
