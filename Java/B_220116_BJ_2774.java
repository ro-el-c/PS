// 아름다운 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B_220116_BJ_2774 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());

        for(int i=0; i<T; i++){
            int N = Integer.parseInt(bf.readLine());
            int[] arr = new int[Integer.toString(N).length()];
            ArrayList<Integer> li = new ArrayList<>();

            for(int j=0; j<arr.length; j++){
                int temp = N%10;
                arr[j] = temp;
                N = N/10;
            }
            for(int num:arr){
                if(!li.contains(num))
                    li.add(num);
            }

            sb.append(li.size() + "\n");
        }
        System.out.print(sb);

    }
}
