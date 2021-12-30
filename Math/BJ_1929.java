// 소수 구하기
// M 이상 N 이하의 소수 모두 출력

// 에라토스테네스의 체

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BJ_1929 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int m, n;
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        bf.close();

        if(m>n){
            System.out.println("M is bigger than N");
            return;
        }

        /* arr[i]의 값이 0이면 소수 */
        int[] arr = new int[n+1];
        arr[1] = 1; // 1은 소수가 아님.

        for(int i=2; i<=n; i++){ // 숫자 i에 대하여 소수 여부 저장
            for(int j=2; i*j<=n; j++){ // 범위 내에서, 소수가 아닌 수 1로 저장
                arr[i*j] = 1;
            }
        }

        for(int j=m; j<=n; j++)
            if(arr[j] != 1)
                System.out.println(j);

    }
}


/*
// 시간 복잡도 O(N^2)
public class Main {
    public static void checkPrimeNum(int x){
        if(x<2){
            return;
        }
        for(int i=2; i<=x/2; i++){
            if(x%i == 0)
                return;
        }
        System.out.println(x);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int m, n;
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        System.out.println(m+" " + n);
        if(m>n){
            System.out.println("M is bigger than N");
            return;
        }

        for(int i=m; i<=n; i++)
            checkPrimeNum(i);

    }
}
*/