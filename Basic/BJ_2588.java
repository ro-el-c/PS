// 곱셈
// 세자리 두 수 곱셈에서 a와 b의 각자리 곱 출력 및 전체 곱셈 결과 출력
import java.util.Scanner;
import java.lang.Math;

public class BJ_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, k, sum=0, l;
        int[] arr = new int[3];

        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        for(int i=0; i<3; i++){
            if(i==0)
                k = b%10;
            else{
                k = (int)Math.floor((double)b/Math.pow(10, i))%10;
            }
            arr[i] = a*k;
            System.out.println(arr[i]);
            sum += arr[i]*(Math.pow(10, i));
        }
        System.out.print(sum);

        /*
            System.out.println(b%10);
            System.out.println((b%100)/10);
            System.out.println(b/100);
            System.out.println(a*b);
        */
    }
}
