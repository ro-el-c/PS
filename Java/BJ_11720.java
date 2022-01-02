// 숫자의 합
// N개 숫자 공백 없이. 모두 합해서 출력
import java.util.Scanner;

public class BJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum=0;

        n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        sc.close();
        // nextInt() 는 \n 을 읽어들이지 않기 때문에,
        // nextInt() 사용 후 nextLine()을 사용하면, 엔터 값을 받아들여 런타임 에러가 발생.
        // 따라서, 개행과 공백을 무시하는 next()를 사용하거나,
        // nextLine()을 한 번 더 사용한 뒤 문자열을 받아온다

        for(int i=0; i<n; i++){
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}