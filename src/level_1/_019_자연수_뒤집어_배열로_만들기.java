package level_1;

// 2026.05.01
// 정수 배열이 주어질 때, 배열의 원소 중 두 개를 곱해 만들 수 있는 최대값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12932

import java.util.Arrays;

public class _019_자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        // 입력
        long n = 12345;

        // 로직
        if (n == 0) {
            System.out.println("[0]");
            return;
        }

        int[] answer = new int[String.valueOf(n).length()];
        int num = 0;
        int count = 0;
        while (n > 0){
            num = (int)n % 10;
            n /= 10;
            answer[count++] = num;
        }

        // 출력
        System.out.println(Arrays.toString(answer));
    }
}

/*
class Solution {
    public int[] solution(long n) {
        if (n == 0) return new int[]{0};

        int[] answer = new int[String.valueOf(n).length()];
        int idx = 0;

        while (n > 0) {
            answer[idx++] = (int)(n % 10);
            n /= 10;
        }

        return answer;
    }
}
 */