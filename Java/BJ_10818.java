// 최소, 최대
// N 개 정수 입력 -> 최소 최대 출력
import java.util.Scanner;

public class BJ_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, tempNum, min=1000000, max=-1000000;
        // 최소, 최대 비교를 위해 초기 minimum 값은 입력값으로 받을 수 있는 최댓값으로, maximum 값은 입력값으로 받ㅇ르 수 있는 최솟값으로 초기화
        N = sc.nextInt();

        // N 개의 정수를 읽어들일 때마다 최소, 최댓값 비교 후 유지 및 갱신
        for(int i=0; i<N; i++){
            tempNum = sc.nextInt();
            if(tempNum < min)
                min = tempNum;
            if(tempNum > max)
                max = tempNum;
        }

        System.out.println(min + " " + max);
    }
}
