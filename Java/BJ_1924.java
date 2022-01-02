// 2007년
// x월 y일 -> 무슨 요일?
import java.util.Scanner;

public class BJ_1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, totalDay=0;

        x = sc.nextInt(); // 월
        y = sc.nextInt(); // 일
        sc.close();

        /* 2007년 1월 ~ 12월까지 각 며칠이 존재함을 monthDay 배열에 저장 */
        int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        /* 1월 1일이 월요일이므로, 1을 7로 나눈 값 즉, index 1의 값을 월요일로 배열에 요일 저장 -> 일요일은 index 0의 값 */
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        /* x월의 전 달까지의 모두 며칠인지 더하고, 구하려는 x월의 일 수인 y를 더하여
           x월 y일이 1월 1일부터 총 며칠째 날인지를 totalDay 에 저장 */
        for (int i = 0; i < x-1; i++) {
            totalDay += monthDay[i];
        }
        totalDay += y;

        // 총 날짜 수를 7로 나눈 나머지의 값으로 요일 계산
        System.out.println(day[totalDay%7]);

    }
}
