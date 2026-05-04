package level_0;

// 2026.05.04
// 분수를 소수로 고칠 때, 유한소수라면 1을 아니라면 2를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120878

public class _064_유한소수_판별하기 {
    public static void main(String[] args) {
        // 입력
        int a = 7;
        int b = 21;

        // 로직
        int answer = 2;
        int gcd = gcd(a, b);
        b /= gcd;

        while (b % 2 == 0) {
            b /= 2;
        }

        while (b % 5 == 0) {
            b /= 5;
        }

        if (b == 1){
            answer = 1;
        }

        // 출력
        System.out.println(answer);
    }
    static int gcd(int a, int b){
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}

/*
class Solution {
    public int solution(int a, int b) {
        int gcd = gcd(a, b);
        b /= gcd;

        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }

        return (b == 1) ? 1 : 2;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
 */