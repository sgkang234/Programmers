package level_0;

// 2026.05.16
// 암호화된 문자열 cipher를 받고, 그 문자열에서 code의 배수 번째 글자만 암호일 때 암호를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120892

public class _076_암호_해독 {
    public static void main(String[] args) {
        // 입력
        String cipher = "pfqallllabwaoclk";
        int code = 2;

        // 로직
        String answer = "";
        for (int i = code-1 ; i < cipher.length(); i+=code) {
            answer += cipher.charAt(i);
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = code-1 ; i < cipher.length(); i+=code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }
}
 */