package level_0;

// 2026.04.27
// 구슬의 개수 balls와 구슬을 나누어 줄 구슬의 개수 share이 주어질 때, balls의 구슬 중 share의 구슬을 고르는 가능한 모든 수를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120840

public class _038_구슬을_나누는_경우의_수 {
    public static void main(String[] args) {
        // 입력
        int balls = 3;
        int share = 2;

        // 로직
        int answer = 1;
        for (int i = 1; i <= share; i++) {
            answer = answer * (balls - i + 1) / i;
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        for (int i = 1; i <= share; i++) {
            answer = answer * (balls - i + 1) / i;
        }
        return answer;
    }
}
 */