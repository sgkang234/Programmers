package level_1;

// 2026.05.13
// 두 정수의 최대공약수와 최소공배수를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12940

import java.util.Arrays;

public class _024_최대공약수와_최소공배수 {
    public static void main(String[] args) {
        // 입력
        int n = 3;
        int m = 12;

        // 로직
        int gcd = gcd(n, m); // 최소공배수
        int lcm = n * m / gcd; // 최대공약수
        int[] answer = {gcd, lcm};
        // 출력
        System.out.println(Arrays.toString(answer));

    }
    static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

/*
class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m); // 최소공배수
        int lcm = n * m / gcd;
        int[] answer = {gcd, lcm};
        return answer;
    }
    static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
 */