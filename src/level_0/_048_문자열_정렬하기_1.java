package level_0;

// 2026.04.29
// my_string 안에 있는 숫자만 골라 오름차순 정렬해 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120850

import java.util.Arrays;

public class _048_문자열_정렬하기_1 {
    public static void main(String[] args) {
        // 입력
        String my_string = "p2o4i8gj2";

        // 로직
        String numStr = my_string.replaceAll("[^0-9]", "");

        int[] answer = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            answer[i] = numStr.charAt(i) - '0';
        }
        Arrays.sort(answer);

        // 로직
        System.out.println(java.util.Arrays.toString(answer));
    }
}

/*
class Solution {
    public int[] solution(String my_string) {
        String numStr = my_string.replaceAll("[^0-9]", "");

        int[] answer = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            answer[i] = numStr.charAt(i) - '0';
        }
        Arrays.sort(answer);
        return answer;
    }
}
 */