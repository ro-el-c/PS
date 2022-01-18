// 안테나
// 모든 집까지의 거리의 총 합이 최소가 되도록 설치

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_18310 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] home = new int[n];
        int[] distance = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++)
            home[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(home);

        System.out.print(home[(n-1)/2]);
    }
}