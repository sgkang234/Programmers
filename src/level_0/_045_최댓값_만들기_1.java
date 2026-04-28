package level_0;

// 2026.04.28
// 원소 중 두 개를 곱해 만들 수 있는 최댓값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120847

import java.util.Arrays;

public class _045_최댓값_만들기_1 {
    public static void main(String[] args) {
        // 입력
        int[] numbers = {0, 31, 24, 10, 1, 9};

        // 로직
        Arrays.sort(numbers);
        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }
}
 */