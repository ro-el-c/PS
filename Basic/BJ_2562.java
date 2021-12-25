// 최댓값
import java.util.Scanner;

public class BJ_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0, where=0, num;
        for(int i=1; i<=9; i++){
            num = sc.nextInt();
            if(max<num){
                max = num;
                where = i;
            }
        }
        sc.close();
        System.out.println(max);
        System.out.print(where);
    }
}
