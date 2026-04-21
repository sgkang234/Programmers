package level_1;

// 2026.04.21
// 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12917

import java.util.Arrays;

public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        // 입력
        String s = "Zbcdefg";

        // 로직
        String answer = "";
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        Arrays.sort(arr);
        for (int i = s.length()-1; i >= 0; i--) {
            answer += arr[i];
        }
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        Arrays.sort(arr);
        for (int i = s.length()-1; i >= 0; i--) {
            answer += arr[i];
        }
        return answer;
    }
}
 */