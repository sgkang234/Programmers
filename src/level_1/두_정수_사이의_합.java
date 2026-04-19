package level_1;

// 2026.04.19
// 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12912

public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        // 입력
        long a = 5;
        long b = 6;

        // 로직
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        long answer = (max + min) * (max - min + 1) / 2;

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public long solution(int a, int b) {
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        long answer = (max + min) * (max - min + 1) / 2;
        return answer;
    }
}
*/