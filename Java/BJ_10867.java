// 중복 빼고 정렬하기

// HashSet 으로 중복 제외하고 저장
// int[] 배열로 변환 후 sort
// 또는 ArrayList -> Collections.sort

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_10867 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++)
            set.add(Integer.parseInt(st.nextToken()));

        ArrayList<Integer> al = new ArrayList<>(set);
        Collections.sort(al);
        for(int x:al)
            sb.append(x + " ");

        /*
        Integer[] arr = set.toArray(new Integer[set.size()]);

        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++)
            sb.append(arr[i] + " ");
            */

        System.out.print(sb);
    }
}