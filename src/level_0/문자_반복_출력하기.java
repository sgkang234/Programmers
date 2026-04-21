package level_0;

// 2026.04.21
// 문자열을 반복해 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120825

public class 문자_반복_출력하기 {
    public static void main(String[] args) {
        // 입력
        String my_string = "hello";
        int n = 3;

        // 로직
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
 */