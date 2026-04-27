package level_0;

// 2026.04.20
// 정수 배열 numbers가 주어질 때, numbers의 원소의 평균값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120817

public class _018_배열의_평균값 {
    public static void main(String[] args) {
        // 입력
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 로직
        double answer = 0;
        for(int i : numbers){
            answer += i;
        }
        answer /= numbers.length;

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i : numbers){
            answer += i;
        }
        answer /= numbers.length;
        return answer;
    }
}
*/