package level_0;

// 2026.04.19
// 정수보다 작은 홀수만 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120813

import java.util.ArrayList;

public class 짝수는_싫어요 {
    public static void main(String[] args) {
        // 입력
        int n = 15;

        // 로직
        int size = (n + 1) / 2;
        int index = 0;
        int[] answer = new int[size];
        for (int i = 1; i <= n; i+=2) {
            answer[index++] = i;
        }

        // 출력
        System.out.println(java.util.Arrays.toString(answer));
    }
}

/*
class Solution {
    public int[] solution(int n) {
        int size = (n + 1) / 2;
        int[] answer = new int[size];

        int idx = 0;
        for (int i = 1; i <= n; i += 2) {
            answer[idx++] = i;
        }
        return answer;
    }
}
*/
