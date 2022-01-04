// 좌표 정렬하기
// N개의 점에 대하여
// x 좌표 오름차순으로, 만약 x 좌표가 같으면 y 좌표 오름차순으로 정렬 후 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BJ_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(bf.readLine());
        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0])
                    return o1[1] - o2[1];
                else
                    return o1[0] - o2[0];
            }
        });

        for(int i=0; i<N; i++)
            sb.append(arr[i][0] + " " + arr[i][1] +"\n");

        System.out.print(sb);
    }
}
