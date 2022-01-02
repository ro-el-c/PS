import java.util.Scanner;

public class BJ_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        System.out.println(A+B);
    }
}

/*
   BJ_2558 문제도 풀이가 동일
   -> Java의 Scanner nextInt()가 공백이나 줄바꿈으로 입력을 구분하기 때문에 같은 코드를 사용할 수 있다
*/