package level_2;

// 2026.05.01
// 가로 길이가 2이고, 세로 길이가 1인 직사각형의 타일이 있을때, 이 타일을 이용해 세로의 길이가 2이고, 가로의 길이가 n인 바닥을 채우려할 때, 타일은 가로, 세로로 배치할 수 있고,
// 직사각형 가로의 길이 n이 주어질 때, 이 직사격형을 채우는 경우의 수를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12900
/*
n = 1 인경우 경우의 수 1
n = 1 -> 1
n = 2 -> 2
n = 3 -> 3
n = 4 -> 5
n = 5 -> 8

f(n) = f(n-1) + f(n-2)
즉 피보나치처럼 증가한다.
*/

public class _005_2xn_타일링 {
    public static void main(String[] args) {
        // 입력
        int n = 4;

        // 로직
        int MOD = 1000000007;
        int[] dp  = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        // 출력
        System.out.println(dp[n]);
    }
}
