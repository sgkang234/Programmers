package level_0;

// 2026.05.16
// 대문자를 소문자로 소문자를 대문자로 변환한 문자열을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120893

public class _077_대문자와_소문자 {
    public static void main(String[] args) {
        // 입력
        String my_string = "cccCCC";

        // 로직
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            // 대문자라면 소문자로
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            }

            // 소문자라면 대문자로
            else {
                answer += Character.toUpperCase(c);
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            // 대문자라면 소문자로
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            }

            // 소문자라면 대문자로
            else {
                answer += Character.toUpperCase(c);
            }
        }
        return answer;
    }
}
 */