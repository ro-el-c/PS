// 덩치
// 각 사람의 덩치 등수 출력
// 본인보다 덩치 큰 사람이 k 명일 때, 덩치 등수는 k+1
// 브루트포스

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++){
            int cnt=1;
            for(int j=0; j<N; j++){
                if(i==j)
                    continue;

                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
                    cnt++;
            }

            sb.append(cnt + " ");
        }

        System.out.print(sb);

    }
}