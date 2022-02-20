// 별 찍기 - 10

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2447 {
    static char[][] arr;
    public static void recursion(int N, int x, int y, boolean nothing){

        if(nothing){
            for(int i=x; i<x+N; i++){
                for(int j=y; j<y+N; j++)
                    arr[i][j] = ' ';
            }
            return;
        }

        if(N==1){
            arr[x][y] = '*';
            return;
        }

        int temp = N/3;
        int cnt=0;

        for(int i=x; i<x+N; i+=temp){
            for(int j=y; j<y+N; j+=temp){
                cnt++;
                if(cnt==5)
                    recursion(temp, i, j, true);
                else
                    recursion(temp, i, j, false);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        recursion(N, 0, 0, false);

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++)
                sb.append(arr[i][j]);
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
