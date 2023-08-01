public class P_1_신규아이디추천 {
    private static String solution(String new_id) {
        // 1. 소문자로
        String answer = new_id.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<answer.length(); i++) {
            char c = answer.charAt(i);

            // 2. 영문 소문자, 숫자, -, ., _ 아니면 삭제
            if (Character.isLowerCase(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.')
                sb.append(c);
        }
        answer = sb.toString();

        // 3. ..., .. 등 .이 연속된 경우 .로 치환
        while (answer.contains(".."))
            answer = answer.replace("..", ".");

        // 4. 처음과 끝에 위치한 . 제거
        if (answer.length() > 0 && answer.charAt(0) == '.')
            answer = answer.substring(1, answer.length());
        if (answer.length() > 0 && answer.charAt(answer.length()-1) == '.')
            answer = answer.substring(0, answer.length()-1);

        // 5. 빈 문자열이면 a 삽입
        if (answer.equals(""))
            answer = "a";

        // 6. 16자 이상인 경우 첫 15자로 자르고, 마지막 문자가 . 인지 검사
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.charAt(answer.length()-1) == '.')
                answer = answer.substring(0, answer.length() - 1);
        }

        // 7. 2자 이하인 경우, 마지막 문자를 길이가 3이 될 때까지 반복해서 붙임
        if (answer.length() <= 2) {
            char temp = answer.charAt(answer.length() - 1);
            while (answer.length() < 3)
                answer += temp;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("문제의 입력 값"));
    }
}