package level_0;

// 2026.04.23
// 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120833

import java.util.Arrays;

public class 배열_자르기 {
    public static void main(String[] args) {
        // 입력
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;

        // 로직
        int[] answer = new int[num2-num1+1];
        int num = 0;
        for (int i = num1; i <=num2 ; i++) {
            answer[num] = numbers[i];
            num++;
        }

        // 출력
        System.out.println(Arrays.toString(answer));
    }
}

/*
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int num = 0;
        for (int i = num1; i <=num2 ; i++) {
            answer[num] = numbers[i];
            num++;
        }
        return answer;
    }
}
 */