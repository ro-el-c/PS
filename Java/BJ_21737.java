// SMUPC 계산기
// S : -  M : *  U : / (정수 몫 나눗셈)  P : +  C : 여태까지 계산 결과 반환
// 기호 개수 : N, 1 <= N <= 500000

// String, Parsing (문자열, 파싱)

/*
    String + 연산 -> 시간 초과
    StringBuilder append -> 맞았습니다!!

     String 의 + 연산이 느려서 StringBuilder 의 append 메소드를 사용하면 시간을 훨씬 단축할 수 있음
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BJ_21737 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        StringBuilder tempStr = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        //String tempStr = "";
        char flag = ' ';
        int result = -100, num=0, cnt=0;

        for(int i=0; i<str.length(); i++){
            char s = str.charAt(i);

            if('0' <= s && s <= '9'){
                tempStr.append(str.charAt(i));
                //tempStr += str.charAt(i);
            }else{
                if(tempStr.toString().equals(""))
                    tempStr.append(Integer.toString(num));
                //if(tempStr.equals(""))
                //    tempStr = Integer.toString(num);

                num = Integer.parseInt(tempStr.toString());
                //tempStr = "";
                tempStr = new StringBuilder();

                if(flag == ' ')
                    result = num;
                else if(flag == 'S')
                    result -= num;
                else if(flag == 'M')
                    result *= num;
                else if(flag == 'U')
                    result /= num;
                else if(flag == 'P')
                    result += num;

                flag = s;

                if(s == 'C'){
                    cnt++;
                    ans.append(result + " ");
                }
            }
        }

        if(cnt == 0)
            System.out.print("NO OUTPUT");

        System.out.print(ans);

    }
}
