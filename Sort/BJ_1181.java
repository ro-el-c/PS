// 단어 정렬
// 소문자로 이루어진 N개의 단어 (1 <= N <= 20000)
// 1. 길이가 짧은 것부터
// 2. 길이가 같으면 사전 순으로

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;


public class BJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String str, temp="";
        String[] arr;

        int N = Integer.parseInt(st.nextToken());
        arr = new String[N];

        for (int i = 0; i < N; i++)
            arr[i] = bf.readLine();

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length())
                    return o1.compareTo(o2); // 같은 길이라면, 사전 순으로 정렬
                else
                    return o1.length() - o2.length(); //// 문자열 길이에 대하여 오름차순. o1의 길이가 o2보다 크다면 자리 바꿈
            }
        });
        /*
            int compare(T o1, T o2) 일 때, return 값의 의미
            양수 : o1이 왼쪽이어야 함
            0    : o1과 o2가 같다
            음수 : o2가 왼쪽이어야 함

            따라서, 위 return o1.length() - o2.length() 의 값이 양수, 즉, o1의 길이가 o2보다 클 때, 두 문자열의 자리가 바뀐다.

        */

        /*
        사전 순으로 정렬 후, 문자열의 길이순으로 다시 정렬

        Arrays.sort(arr);
        Arrays.sort(arr, Comparator.comparing(String::length));
        */

        for(int i=0; i<N; i++)
            if(!temp.equals(arr[i])){
                System.out.println(arr[i]);
                temp = arr[i];
            }
    }
}