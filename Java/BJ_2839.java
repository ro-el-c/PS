// 설탕 배달
// 정확하게 N 킬로그램 배달
// 3, 5 킬로그램 봉지
// 최대한 적은 봉지
// 그리디 알고리즘
import java.util.Scanner;

public class BJ_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, min=Integer.MAX_VALUE, num;
        N = sc.nextInt();
        sc.close();

        if(N%5 == 0)
            System.out.print(N/5);
        else{
            num = N/5;
            for(int i=num; i>=0; i--){ // 5 킬로그램 봉지가 최대일 때부터 0개일 때까지
                int cnt=i;
                int temp=N;

                temp -= cnt*5;

                if(temp%3 == 0){
                    cnt += temp/3;
                    if(min > cnt)
                        min = cnt;
                }
                //System.out.println("cnt : "+cnt+", min : "+min);
            }
            if(min==Integer.MAX_VALUE)
                System.out.print(-1);
            else
                System.out.print(min);
        }

    }
}
