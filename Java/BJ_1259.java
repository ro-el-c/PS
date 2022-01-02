// 팰린드롬수
// : 뒤에서부터 읽어도 똑같은 단어
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BJ_1259 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str, what="?";
        boolean yorn;
        int n;
        while(!(str = bf.readLine()).equals("0")){
            yorn = true;
            n = str.length();

            if (n == 1) {
                System.out.println("yes");
                continue;
            }

            for(int i=0; i<n/2; i++){
                if(str.charAt(i) != str.charAt(n-1-i)){
                    yorn = false;
                    break;
                }
                if(i == n/2-1)
                    yorn = true;
            }

            if (yorn)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}