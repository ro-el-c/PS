// K 번째 수

import java.io.*;
import java.util.*;

public class BJ_11004 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            list.add(Integer.parseInt(st.nextToken()));

        Collections.sort(list);

        System.out.println(String.valueOf(list.get(target - 1)));
    }
}