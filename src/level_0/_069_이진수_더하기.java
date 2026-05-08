package level_0;

// 2026.05.08
// 두 개의 이진수를 더한 결과를 이진수 문자열로 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120885

public class _069_이진수_더하기 {
    public static void main(String[] args) {
        // 입력
        String b1 = "10";
        String b2 = "11";

        // 로직
        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2, 2);

        int sum = n1 + n2;

        String answer = Integer.toBinaryString(sum);

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(String b1, String b2) {
        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2, 2);

        int sum = n1 + n2;

        String answer = Integer.toBinaryString(sum);
        return answer;
    }
}
 */
