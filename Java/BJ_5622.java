// 다이얼

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        int sum=0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if('A'<=ch && ch<='C')
                sum += 3;
            else if('D'<=ch && ch<='F')
                sum += 4;
            else if('G'<=ch && ch<='I')
                sum += 5;
            else if('J'<=ch && ch<='L')
                sum += 6;
            else if('M'<=ch && ch<='O')
                sum += 7;
            else if('P'<=ch && ch<='S')
                sum += 8;
            else if('T'<=ch && ch<='V')
                sum += 9;
            else if('W'<=ch && ch<='Z')
                sum += 10;
        }

        System.out.print(sum);


    }
}