// 럭키 스트레이트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_18406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum=0;

        for(int i=0; i<str.length()/2; i++)
            sum += str.charAt(i) - '0';

        for(int i=str.length()/2; i<str.length(); i++)
            sum -= str.charAt(i) - '0';

        if(sum == 0)
            System.out.print("LUCKY");
        else
            System.out.print("READY");

    }
}