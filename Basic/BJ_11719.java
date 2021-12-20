// 그대로 출력2 -> 알파벳 소문자, 대문자, 공백, 숫자로 이루어짐

import java.util.Scanner;

public class BJ_11719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while(sc.hasNextLine()){
            str = sc.nextLine();
            System.out.println(str);
        }
        sc.close();
    }
}

// hasNext() : 타음 토큰 존재 여부, 공백 무시
// hasNextLin() : 다음 행 존재 여부