// 접미사 배열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String[] arr = new String[str.length()];
        arr[0] = str;

        for(int i=1; i<arr.length; i++)
            arr[i] = str.substring(i, str.length());

        Arrays.sort(arr);

        for(String s:arr)
            sb.append(s).append("\n");

        System.out.print(sb);

    }
}