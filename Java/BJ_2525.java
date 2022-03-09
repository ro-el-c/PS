// 오븐 시계

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour, min;
        hour = Integer.parseInt(st.nextToken());
        min = Integer.parseInt(st.nextToken());

        int length = Integer.parseInt(br.readLine());
        min += length;
        if(min >= 60){
            hour += min/60;
            min -= 60*(min/60);

            if(hour >= 24)
                hour -= 24;
        }

        System.out.print(hour + " " + min);
    }
}
