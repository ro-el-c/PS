// 소수 찾기
import java.util.Scanner;

public class BJ_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, num, cnt=0;
        int N = sc.nextInt();
        for(int n=0; n<N; n++){
            boolean notPrime = false;
            num = sc.nextInt();

            if(num == 1)
                notPrime = true;
            else{
                for(int j=2; j<=num/2; j++){
                    if(num%j == 0){
                        notPrime = true;
                        break;
                    }
                }
            }

            if(!notPrime)
                cnt++;

        }
        sc.close();
        System.out.print(cnt);
    }
}
