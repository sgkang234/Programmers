package level_0;

// 2026.04.18
// 두 정수를 나눈 값에 1000을 곱한 정수를 반환하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120806

public class _007_두_수의_나눗셈_구하기 {
    public static void main(String[] args) {
        // 입력
        int num1 = 7;
        int num2 = 3;

        // 로직
        int answer = (int)((double) num1 / num2 * 1000);

        // 출력
        System.out.print(answer);
    }
}

/*
class Solution {
    public int solution(int num1, int num2) {
        int answer = (int)((double) num1 / num2 * 1000);
        return answer;
    }
}
*/