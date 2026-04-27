package level_0;

// 2026.04.21
// 문자열을 뒤집어 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120822

public class _023_뒤집힌_문자열 {
    public static void main(String[] args) {
        // 입력
        String my_string = "jaron";

        // 로직
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }

        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
 */