package level_0;

// 2026.05.26
// n이 양이고 t가 시간일 때 곱해지는 양
// https://school.programmers.co.kr/learn/courses/30/lessons/120910

public class _092_세균_증식 {
    public static void main(String[] args) {
        // 입력
        int n = 7;
        int t = 15;

        // 로직
        int answer = n;
        for (int i = 0; i < t; i++) {
            answer += answer;
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i < t; i++) {
            answer += answer;
        }
        return answer;
    }
}
 */