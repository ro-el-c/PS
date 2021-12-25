// 문자열 반복
// 문자열 S 입력. 각 문자 R번 반복한 새로운 문자열 P 출력
import java.util.Scanner;

public class BJ_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S, P;
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int R = sc.nextInt();
            S = sc.next();
            P = "";
            for(int j=0; j<S.length(); j++){
                for(int k=0; k<R; k++)
                    P += S.charAt(j);
            }
            System.out.println(P);
        }
        sc.close();
    }
}
