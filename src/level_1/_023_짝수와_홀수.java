package level_1;

// 2026.05.13
// 입력된 정수가 짝수일 경우 "Even", 홀수일 경우 "Odd"를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12937

public class _023_짝수와_홀수 {
    public static void main(String[] args) {
        // 입력
        int num = 3;

        // 로직
        String s = "";
        s = num%2 == 0 ? "Even": "Odd";

        // 출력
        System.out.println(s);
    }
}

/*
class Solution {
    public String solution(int num) {
        String s = "";
        s = num%2 == 0 ? "Even": "Odd";
        return  s;
    }
}
 */