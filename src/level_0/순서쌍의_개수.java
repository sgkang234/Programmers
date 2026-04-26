package level_0;

// 2026.04.26
// 자연수 n이 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120836

public class 순서쌍의_개수 {
    public static void main(String[] args) {
        // 입력
        int n = 100;

        // 로직
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}
 */