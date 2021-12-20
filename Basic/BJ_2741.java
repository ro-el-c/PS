// N 찍기
// 자연수 N 주어짐. 1부터 N까지 한 줄에 하나씩 출력
import java.util.Scanner;

public class BJ_2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(i+1);
        }
    }
}
