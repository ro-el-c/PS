// 단어 공부
// 단어에서 가장 많이 사용된 알파벳 출력
import java.util.Scanner;

public class BJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26]; // 알파벳 개수
        int max = 0;
        char ch = '?';

        String str = sc.next().toUpperCase(); // 대소문자 구분 X, 출력은 대문자로 하므로, 입력 단어의 모든 문자 대문자로 변경
        sc.close();

        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)-65]++;
            if(max < arr[str.charAt(i)-65]){
                max = arr[str.charAt(i)-65];
                ch = str.charAt(i);
            }
            else if(max == arr[str.charAt(i)-65]){ // 같은 개수의 문자가 존재할 때, ? 출력
                ch = '?';
            }
        }

        System.out.print(ch);
    }
}
