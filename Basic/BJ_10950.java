import java.util.Scanner;

public class BJ_10950 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, n;

        n = sc.nextInt();
        for(int i=0; i<n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }

        sc.close();
    }
}
