// 소수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2581 {
    public static boolean checkPrimeNum(int x){
        if(x<2){
            return false;
        }
        for(int i=2; i<=x/2; i++){
            if(x%i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(bf.readLine());
        int N = Integer.parseInt(bf.readLine());

        int sum=0, min= Integer.MAX_VALUE;

        for(int i=M; i<=N; i++){
            if(checkPrimeNum(i)){
                sum += i;
                min = Math.min(min, i);
            }
        }

        if(sum==0)
            System.out.print(-1);
        else{
            System.out.print(sum+"\n"+min);
        }
    }
}