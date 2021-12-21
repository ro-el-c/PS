// 정수 N개의 합
// sum 함수 구현

public class BJ_15596 {
    long sum(int[] a) {
        long ans = 0;
        for(int i=0; i<a.length; i++){
            ans += a[i];
        }
        return ans;
    }
}
