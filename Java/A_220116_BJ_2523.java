// 별 찍기 - 13

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_220116_BJ_2523 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        for(int i=0; i<N; i++){
            for(int j=0; j<i+1; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=N-1; i>0; i--){
            for(int j=0; j<i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}