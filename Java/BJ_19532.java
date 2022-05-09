// 수학은 비대면강의입니다

// 브루트포스

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];

        for(int i=0; i<6; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for(int i=-999; i<1000; i++)
            for(int j=-999; j<1000; j++)
                if(arr[0]*i+arr[1]*j==arr[2] && arr[3]*i+arr[4]*j==arr[5]){
                    System.out.printf("%d %d", i, j);
                    return;
                }

    }
}
