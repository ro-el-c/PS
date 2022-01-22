// 피보나치 함수
// f(3) -> f(2) & f(1) 호출
//    f(2) -> f(1) & f(0) 호출
//        f(1) -> 1 출력, 1 리턴
//        f(0) -> 0 출력, 0 리턴
//      f(2) -> 0+1 리턴
//    f(1) -> 1 출력, 1 리턴
//  f(3) -> 1 + 1 리턴
// 각 테스트 케이스마다 0과 1이 출력되는 횟수 공백으로 구분해 출력


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());

        int[][] arr = new int[41][2];
        // 각 행의 첫 번째 값은 0 개수, 두 번째 값은 1 개수

        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;

        for(int i=2; i<41; i++){
            arr[i][0] = arr[i-1][0] + arr[i-2][0];
            arr[i][1] = arr[i-1][1] + arr[i-2][1];
        }

        for(int i=0; i<T; i++){
            int n = Integer.parseInt(bf.readLine());
            sb.append(arr[n][0] + " " + arr[n][1] + "\n");
        }

        System.out.print(sb);

    }
}