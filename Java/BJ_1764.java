// 듣보잡

// HashSet
// - 증복되는 값 무시
// - 순서 보장 X
// - 존재 여부 검색할 때 용이

// ArrayList vs HashSet
// contains : O(n) vs O(1)

// ArrayList 정렬
// Collections.sort(arr)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N, M;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        for(int i=0; i<N; i++)
            set.add(br.readLine());

        int cnt=0;
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<M; i++){
            String temp = br.readLine();
            if(set.contains(temp)){
                cnt++;
                ans.add(temp);
            }
        }

        Collections.sort(ans);
        sb.append(cnt + "\n");
        for(int i=0; i<ans.size(); i++)
            sb.append(ans.get(i)).append("\n");

        System.out.print(sb);
    }
}
