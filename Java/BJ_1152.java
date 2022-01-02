// 단어의 개수
// 문자열에 몇 개의 단어?

/* 다시 풀어보기 */

import java.util.Scanner;

public class BJ_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        str = str.trim(); // 문자열 양쪽 공백 제거
        if(str.isEmpty()) // 문자열이 공백으로만 이루어진 경우, 1이 출력되기 때문에, 문자열이 비어있는 경우에는 따로 0만 출력
            System.out.print(0);
        else
            System.out.print(str.split(" ").length);
    }
}
