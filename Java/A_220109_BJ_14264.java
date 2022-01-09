// 정육각형과 삼각형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_BJ_14264 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(bf.readLine());
        System.out.print(Math.sqrt(3)/4 * Math.pow((double)L,2));

    }
}