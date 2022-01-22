// 5와 6의 차이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        /*StringBuilder n1_min = new StringBuilder();
        StringBuilder n2_min = new StringBuilder();
        StringBuilder n1_max = new StringBuilder();
        StringBuilder n2_max = new StringBuilder();*/
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String str1 = st.nextToken();
        String str2 = st.nextToken();

        String n1Min = str1.replace('6', '5');
        String n1Max = str1.replace('5', '6');
        String n2Min = str2.replace('6', '5');
        String n2Max = str2.replace('5', '6');

        int ans_min = Integer.parseInt(n1Min) + Integer.parseInt(n2Min);
        int ans_max = Integer.parseInt(n1Max) + Integer.parseInt(n2Max);

        /*for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch == '5' || ch == '6') {
                n1_min.append(5);
                n1_max.append(6);
            }
            else {
                n1_min.append(ch);
                n1_max.append(ch);
            }
        }

        for(int i=0; i<str2.length(); i++){
            char ch = str2.charAt(i);
            if(ch == '5' || ch == '6') {
                n2_min.append(5);
                n2_max.append(6);
            }
            else {
                n2_min.append(ch);
                n2_max.append(ch);
            }
        }

        int ans_min, ans_max;
        ans_min = Integer.parseInt(n1_min.toString()) + Integer.parseInt(n2_min.toString());
        ans_max = Integer.parseInt(n1_max.toString()) + Integer.parseInt(n2_max.toString());*/

        System.out.print(ans_min + " " + ans_max);
    }
}