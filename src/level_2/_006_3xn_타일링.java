package level_2;

// 2026.05.01
// 가로 길이가 2이고, 세로 길이가 1인 직사각형 모양의 타일이 있으며, 이 타일을 세로의 길이가 3이고, 가로의 길이가 n인 바닥을 채우려 할때, n이 주어질 때의 경우의 수를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12902
/*
n = 1 인경우 경우의 수 0
n = 1 -> 0
n = 2 -> 3
n = 3 -> 0
n = 4 -> 11
n = 5 -> 0
n = 6 -> 41

f(n)=4f(n−2)−f(n−4)
*/

public class _006_3xn_타일링 {
    public static void main(String[] args) {
        // 입력
        int n = 6;

        // 로직
        int MOD = 1000000007;
        // 짝수라면
        if (n % 2 != 0){
            System.out.println(0);
            return;
        }

        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[2] = 3;

        for (int i = 4; i <= n; i += 2) {
            dp[i] = (dp[i - 2] * 4 % MOD - dp[i - 4] + MOD) % MOD; // 음수 연산에는 mod를 더해야 한다 음수가 되는 것을 방지
        }

        // 출력
        System.out.println(dp[n]);
    }
}
