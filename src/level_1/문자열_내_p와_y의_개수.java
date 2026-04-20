package level_1;

// 2026.04.20
// 대문자와 소문자가 섞여있는 문자열 s가 주어질 때, s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12916

public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        // 입력
        String s = "pPoooyY";

        // 로직
        s = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                pCount++;
            } else if (s.charAt(i) == 'y') {
                yCount++;
            }
        }
        boolean answer = (pCount == yCount);

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                pCount++;
            } else if (s.charAt(i) == 'y') {
                yCount++;
            }
        }
        boolean answer = (pCount == yCount);

        return answer;
    }
}
*/