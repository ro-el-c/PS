// 과제 안 내신 분..?

import java.util.Scanner;

public class B_BJ_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean[] student = new boolean[31];

        for(int i=0; i<28; i++){
            student[sc.nextInt()] = true;
        }
        for(int i=1; i<=30; i++){
            if(!student[i])
                System.out.println(i);
        }
    }
}
