package level_0;

// 2026.05.26
// 문자열 st1에 str2가 있다면 1을 없다면 2를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120909

public class _091_제곱수_판별하기 {
    public static void main(String[] args) {
        // 이력
        int n = 144;

        // 로직
        int answer = 2;
        int sqrt = (int) Math.sqrt(n);
        if(sqrt * sqrt == n){
            answer = 1;
        }

        // 출력
        System.out.println(answer);

    }
}

/*
class Solution {
    public int solution(int n) {
        int answer = 2;
        int sqrt = (int) Math.sqrt(n);
        if(sqrt * sqrt == n){
            answer = 1;
        }
        return answer;
    }
}
 */