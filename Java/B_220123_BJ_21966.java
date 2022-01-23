// (중략)
// 1. S 길이 25 이하 - 그대로 출력
// 2. 25 초과 - 앞 11, 뒤 11 제외
//            -> 나머지가 모두 같은 문장에 속하면 생략 -> ... 으로 출력
// 3. 1, 2가 아니면 앞 9, 뒤 10 남기고 중간을 ...... 으로 바꾸어 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_BJ_21966 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int len = Integer.parseInt(bf.readLine());
        String str = bf.readLine();

        if(len <= 25){
            System.out.println(str);
            System.exit(0);
        }

        boolean isTwo = true;
        String str2 = str.substring(11, len-12);

        for(char ch : str2.toCharArray()){
            if(ch == '.'){
                isTwo = false;
                break;
            }
        }

        if(isTwo){
            sb.append(str.substring(0, 11) + "..." + str.substring(len-11));
        }
        else{
            sb.append(str.substring(0, 9) + "......" + str.substring(len-10));
        }

        System.out.println(sb);
    }
}