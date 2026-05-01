package level_1;

// 2026.05.01
// 정수 n을 입력받아 n의 약수를 모두 더한 값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12928

import java.util.Arrays;

public class _016_약수의_합 {
    public static void main(String[] args) {
        // 입력
        int n = 12;

        // 로직
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        // 출력
        System.out.println(sum);
    }
}
