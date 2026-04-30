package level_0;

// 2026.04.29
// a, e, i, o, u 다섯 가지 알파벳을 모음일 때, 이 모음을 제거한 문자열을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120849

public class _047_모음_제거 {
    public static void main(String[] args) {
        // 입력
        String my_string = "nice to meet you";

        // 로직
        String answer = my_string.replaceAll("[aeiou]", "");

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}
 */