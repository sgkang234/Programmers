package level_0;

// 2026.05.23
// 입력한 값의 배수만 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120906

public class _088_자릿수_더하기 {
    public static void main(String[] args) {
        // 입력
        int n = 1234;

        // 로직
        int answer = 0;

        while (n > 0) {
            int num = n % 10;
            n = n / 10;

            answer += num;
        }

        //출력
        System.out.println(answer);
    }
}
/*
class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n>0){
            int num = n%10;
            n = n/10;

            answer += num;
        }

        return answer;
    }
}
 */

