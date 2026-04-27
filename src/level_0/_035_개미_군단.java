package level_0;

// 2026.04.26
// 입력된 값을 최소한의 개수로 해결하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120837

public class _035_개미_군단 {
    public static void main(String[] args) {
        // 입력
        int hp = 23;

        // 로직
        int a = 5;
        int b = 3;
        int c = 1;
        int answer = 0;

        answer += hp / 5;  // 장군개미
        hp %= 5;

        answer += hp / 3;  // 병정개미
        hp %= 3;

        answer += hp;      // 일개미

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int hp) {
        int a = 5;
        int b = 3;
        int c = 1;
        int answer = 0;

        answer += hp / 5;  // 장군개미
        hp %= 5;

        answer += hp / 3;  // 병정개미
        hp %= 3;

        answer += hp;
        return answer;
    }
}
 */