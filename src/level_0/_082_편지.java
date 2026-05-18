package level_0;

// 2026.05.18
// 입력한 문자열의 길이 두배 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120898

public class _082_편지 {
    public static void main(String[] args) {
        // 입력
        String message = "I love you~";

        // 로직
        int answer = message.length();
        answer *= 2;

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(String message) {
        int answer = message.length();
        answer *= 2;
        return answer;
    }
}
 */