package level_0;

// 2026.04.18
// 두 정수를 나눈 값의 몫을 정수로 반환하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120805

public class _006_두_수의_몫_구하기 {
    public static void main(String[] args) {
        // 입력
        int num1 = 10;
        int num2 = 5;

        // 로직
        int answer = num1 / num2;

        // 출력
        System.out.print(answer);
    }
}

/*
class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }
}
*/