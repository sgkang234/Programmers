package level_0;

// 2026.04.23
// 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120831

public class _030_짝수의_합 {
    public static void main(String[] args) {
        // 입력
        int n = 10;

        // 로직
        int answer = 0;
        for (int i = 2; i <= n; i+=2) {
            answer+= i;
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i+=2) {
            answer+= i;
        }
        return answer;
    }
}
 */