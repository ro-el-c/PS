// 입력(줄 단위)이 존재하는만큼

import java.util.Scanner;

public class BJ_10951 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;

        while(sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }

        sc.close();
    }
}
