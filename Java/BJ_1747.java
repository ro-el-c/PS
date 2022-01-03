// 소수 & 팰린드롬
// 소수 -> 에라토스테네스의 체 / 범위는 충분히 크게
// 브루트포스

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_1747 {
    public static int[] primeArr(){
        int x = 1005000;
        int[] arr = new int[x+1];

        arr[1] = 1;

        for(int i=2; i<=x; i++){
            if(arr[i] != 1){
                for(int j=2; i*j<=x; j++)
                    arr[i*j] = 1;
            }
        }

        return arr;
    }

    public static boolean palindrome(int x){
        String str = Integer.toString(x);

        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1))
                return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = primeArr();

        for(int i=N; ; i++)
            if(arr[i] != 1 && palindrome(i)){
                System.out.print(i);
                break;
            }
    }
}
