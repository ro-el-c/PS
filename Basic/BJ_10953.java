// test case 개수 주어짐
// A 와 B 콤마(,)로 구분

import java.util.Scanner;

public class BJ_10953 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, n;
        String s;
        String[] arr = new String[2];

        n = sc.nextInt();

        for(int i=0; i<n; i++){
            s = sc.nextLine();
            arr = s.split(",");

            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }

        sc.close();
    }
}
