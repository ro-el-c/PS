// 국영수
// 국어점수가 감소하는 순
// 국어 같으면 영어 증가 순
// 국어, 영어 같으면 수학 감소 순
// 모든 점수 같으면 이름이 사전 증가 순 (아스키코드에서 대문자가 소문자보다 작으므로, 앞에 온다.)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BJ_10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][4];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++)
                arr[i][j] = st.nextToken();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                if(Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])){
                    if(Integer.parseInt(s1[2]) == Integer.parseInt(s2[2])){
                        if(Integer.parseInt(s1[3]) == Integer.parseInt(s2[3])){
                            return s1[0].compareTo(s2[0]);
                        }
                        return Integer.compare(Integer.parseInt(s2[3]), Integer.parseInt(s1[3]));
                    }
                    return Integer.compare(Integer.parseInt(s1[2]), Integer.parseInt(s2[2]));
                }
                return Integer.compare(Integer.parseInt(s2[1]), Integer.parseInt(s1[1]));
            }
        });

        for(int i=0; i<N; i++)
            sb.append(arr[i][0]).append("\n");

        System.out.print(sb);

    }
}