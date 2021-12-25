// 음계
// 다장조 c, d, e, f, g, a, b, C (8개 음)
// ->     1, 2, 3, 4, 5, 6, 7, 8
// 1~8 차례대로 : ascending
// 8~1 차례대로 : descending
// 둥 다 아님 : mixed
import java.util.Scanner;

public class BJ_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gap=0, a, b;
        String what = "what";
        a = sc.nextInt();
        for(int i=0; i<7; i++){
            b = sc.nextInt();
            gap = b-a;
            if(gap!=1 && gap!=-1){
                what = "mixed";
                break;
            }
            a = b;
            if(i==6){
                if(gap == 1)
                    what = "ascending";
                else
                    what = "descending";
            }
        }
        System.out.print(what);
    }
}