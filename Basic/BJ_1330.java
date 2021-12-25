// 두 수 비교하기
import java.util.Scanner;

public class BJ_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();

        if(A<B)
            System.out.print("<");
        else if(A>B)
            System.out.print(">");
        else
            System.out.print("==");
    }
}