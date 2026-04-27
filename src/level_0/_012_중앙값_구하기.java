package level_0;

// 2026.04.19
// 배열을 정렬했을 때, 중앙값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120811

import java.util.Arrays;

public class _012_중앙값_구하기 {
    public static void main(String[] args) {
        // 입력
        int[] array = {9, -1, 0};

        // 로직
        Arrays.sort(array);
        int answer = array[array.length/2];

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length/2];
        return answer;
    }
}
*/