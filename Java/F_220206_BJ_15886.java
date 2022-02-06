// 내 선물을 받아줘 2
// 1xN 크기의 직사각형 지도
// 지도의 각 칸에는 E, W 중 한 문자가 쓰여져 있음
// E 는 (1, X+1) 칸으로 이동, W 는 (1, X-1) 칸으로 이동

// EW (방향이 바뀌는 곳) 에 하나씩 두면 무조건 선물을 가져갈 수 있다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_220206_BJ_15886 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String str = bf.readLine();

        int cnt=0;

        for(int i=0; i<str.length()-1; i++){
            String temp = str.substring(i, i+2);
            if(temp.equals("EW"))
                cnt++;
        }

        System.out.print(cnt);
    }
}