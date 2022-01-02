// 입력(줄 단위)이 존재하는만큼
// 입력의 마지막 0 두 개

import java.util.Scanner;

public class BJ_10952 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;

        while(sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0 && b == 0) break;
            System.out.println(a+b);
        }

        sc.close();
    }
}
