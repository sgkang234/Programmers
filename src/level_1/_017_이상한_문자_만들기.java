package level_1;

// 2026.05.01
// 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾸어 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12930

public class _017_이상한_문자_만들기 {
    public static void main(String[] args) {
        // 입력
        String s = "try hello world";

        // 로직
        int idx = 0; // 단어 내 인덱스
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer += " ";
                idx = 0; // 공백 나오면 초기화
            } else {
                if (idx % 2 == 0) {
                    answer += Character.toUpperCase(c);
                } else {
                    answer += Character.toLowerCase(c);
                }
                idx++;
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0; // 단어 내 인덱스

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer += " ";
                idx = 0; // 공백 나오면 초기화
            } else {
                if (idx % 2 == 0) {
                    answer += Character.toUpperCase(c);
                } else {
                    answer += Character.toLowerCase(c);
                }
                idx++;
            }
        }

        return answer;
    }
}
 */