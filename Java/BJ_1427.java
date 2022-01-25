// 소트인사인드
// 내림차순 정렬 후 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = bf.readLine();
        Integer[] arr =  new Integer[str.length()];
        for(int i=0; i<str.length(); i++)
        arr[i] = Integer.parseInt(Character.toString(str.charAt(i)));

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<str.length(); i++)
            sb.append(arr[i]);

        System.out.print(sb);
    }
}