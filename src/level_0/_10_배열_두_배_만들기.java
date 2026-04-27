package level_0;

// 2026.04.18
// 배열의 각 원소를 순회하며 값을 2배로 변환하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120809

public class _10_배열_두_배_만들기 {
    public static void main(String[] args) {
        // 입력
        int[] numbers = {1, 2, 3, 4, 5};

        // 로직
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }

        // 출력
        System.out.println(java.util.Arrays.toString(numbers));
    }
}

/*
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}
*/
