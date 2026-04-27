package level_0;

// 2026.04.21
// 입력된 문자열에서 특정 문자 제거하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120826

public class _027_특정_문자_제거하기 {
    public static void main(String[] args) {
        // 입력
        String my_string = "abcdef";
        String letter = "f";

        // 로직
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                answer += my_string.charAt(i);
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
 */