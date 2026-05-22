package level_0;

// 2026.05.21
// 정수 num과 k가 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 출력하고 없으면 -1을 하도록
// https://school.programmers.co.kr/learn/courses/30/lessons/120904

public class _086_숫자_찾기 {
    public static void main(String[] args) {
        // 입력
        int num = 29183;
        int k = 1;

        // 로직
        String s = String.valueOf(num);
        int answer = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == (k + '0')) {
                answer = i+1;
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int num, int k) {
        String s = String.valueOf(num);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == (k + '0')) {
                return i + 1;
            }
        }

        return -1;
    }
}
 */