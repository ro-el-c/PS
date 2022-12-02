// 가희야 거기서 자는 거 아니야

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_220109_BJ_21771 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int R, p;

        StringTokenizer st = new StringTokenizer(bf.readLine());
        R = Integer.parseInt(st.nextToken());
        st.nextToken();

        st = new StringTokenizer(bf.readLine());
        st.nextToken();
        st.nextToken();
        p = Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());

        for(int i=0; i<R; i++){
            str = bf.readLine();
            for(int j=0; j<str.length(); j++) {
                if (str.charAt(j) == 'P')
                    p--;
            }
        }

        if(p != 0)
            System.out.print(1);
        else
            System.out.print(0);

    }
}