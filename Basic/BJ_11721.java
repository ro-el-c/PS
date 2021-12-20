// 열 개씩 끊어 출력하기
// 길이가 N인 단어, 한 줄에 10개씩 끊어 출력
import java.util.Scanner;

public class BJ_11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for(int i=0; i<n; i++){
            System.out.print(str.charAt(i));
            if(i%10 == 9)
                System.out.println();
        }
    }
}
