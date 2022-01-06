// ACM 호텔
// H x W 호텔
// 걷는 거리가 가장 짧도록
// ex. 3 x 10 호텔에서 8번째 손님은 203호
// 101 201 301 102 202 302 103 203 순서

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T, H, W, N;
        T = Integer.parseInt(bf.readLine());

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int room;

            if(N % H == 0)
                room = H*100 + N/H;
            else
                room = N%H*100 + N/H + 1;

            sb.append(room + "\n");

        }
        System.out.println(sb);
    }
}