// 그룹 단어
// 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우
// ex aabbccc, ccaxxxxzz => O
//    aabbcccb => X
import java.util.Scanner;

public class BJ_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s;
        int cnt=0;

        for(int i=0; i<N; i++){
            boolean[] check = new boolean[26];
            s = sc.next();
            if(s.length() == 1)
                cnt++;
            else{
                for(int j=0; j<s.length(); j++){
                    if(j==0)
                        check[s.charAt(j)-97] = true;
                    else if(check[s.charAt(j)-97] && (s.charAt(j)!=s.charAt(j-1)))
                        break;
                    else{
                        check[s.charAt(j)-97] = true;
                        if(j == s.length()-1)
                            cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
        sc.close();
    }
}
