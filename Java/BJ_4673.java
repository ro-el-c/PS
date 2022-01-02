// 셀프 넘버
// : 생성자가 없는 숫자
/*
    d(n) : n과 n의 각 자리 수의 합
    n은 d(n)의 생성자
*/

public class BJ_4673 {
    public static void main(String[] args) {
        int dn;
        boolean[] check = new boolean[10001];

        for(int n=1; n<=10000; n++){
            if(d(n)<10001)
                check[d(n)] = true;
        }

        for(int i=1; i<=10000; i++) {
            if (!check[i])
                System.out.println(i);
        }
    }

    /* d(n) 값 반환 함수 */
    public static int d(int num){
        int dn = num;

        while(num > 0){
            dn += num%10;
            num /= 10;
        }

        return dn;
    }
}
