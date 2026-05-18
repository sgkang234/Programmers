package level_1;

// 2026.05.18
// 양의 정수 x가 하샤드 수라면 x의 자릿수의 합으로 x가 나누어 떨어진다. 하샤드 수인지 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12947

public class _027_하샤드_수 {
    public static void main(String[] args) {
        // 입력
        int x = 12;

        // 로직
        int temp = x;
        int sum = 0;
        boolean answer;
        while (temp > 0){
            sum += temp%10;
            temp /= 10;
        }

        answer = x%sum == 0 ? true : false;

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public boolean solution(int x) {
        int temp = x;
        int sum = 0;
        boolean answer;
        while (temp > 0){
            sum += temp%10;
            temp /= 10;
        }

        answer = x%sum == 0 ? true : false;
        return answer;
    }
}
 */