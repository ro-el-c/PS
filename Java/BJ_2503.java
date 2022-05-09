// 숫자 야구

// 브루트포스

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class BJ_2503 {
    static int isFirst=0;
    static ArrayList<Integer> finalArr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] data = new int[3];

        for(int i=0; i<N; i++){
            String str;
            int strike, ball;

            StringTokenizer st = new StringTokenizer(br.readLine());
            str = st.nextToken();
            for(int j=0; j<3; j++)
                data[j] = Character.getNumericValue(str.charAt(j));
            strike = Integer.parseInt(st.nextToken());
            ball = Integer.parseInt(st.nextToken());

            whatNumber(data, strike, ball);
        }

        System.out.print(finalArr.size());
    }

    public static void whatNumber(int[] data, int strike, int ball){
        ArrayList<Integer> tempArr = new ArrayList<>();

        isFirst++;

        for(int i=123; i<=987; i++){
            int testStrike=0, testBall=0;
            int[] tempData = new int[3];

            tempData[0] = i/100;
            tempData[1] = (i%100)/10;
            tempData[2] = i%10;

            if(tempData[1]==0 || tempData[2]==0)
                continue;

            if(tempData[0] == tempData[1] || tempData[1] == tempData[2] || tempData[0] == tempData[2])
                continue;

            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    if(data[j] == tempData[k]){
                        if(j==k)
                            testStrike++;
                        else
                            testBall++;
                    }
                }
            }

            if(testStrike == strike && testBall == ball)
                tempArr.add(i);
        }

        if(isFirst==1)
            finalArr.addAll(tempArr);
        else
            finalArr.retainAll(tempArr);
    }
}
