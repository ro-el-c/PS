// 숫자 카드

// HashSet -> 중복되는 카드 없고, 소지 여부만 확인하면 됨

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BJ_10815 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++)
            set.add(Integer.parseInt(st.nextToken()));

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int j=0; j<M; j++){
            int temp = Integer.parseInt(st.nextToken());
            if(set.contains(temp))
                sb.append(1 + " ");
            else
                sb.append(0 + " ");
        }

        System.out.print(sb);
    }
}