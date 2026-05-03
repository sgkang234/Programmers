package level_0;

// 2026.05.01
// 정수 배열이 주어질 때, 배열의 원소 중 두 개를 곱해 만들 수 있는 최대값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120862

public class _055_최대값_만들기_2 {
    public static void main(String[] args) {
        // 입력
        int[] number = {1, 2, -3, 4, -5};

        // 로직
        int answer = Integer.MIN_VALUE;
        int n = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if(i == j){
                    continue;
                }
                n = number[i] * number[j];
                if(answer < n){
                    answer = n;
                }
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int[] number) {
        int answer = Integer.MIN_VALUE;
        int n = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if(i == j){
                    continue;
                }
                n = number[i] * number[j];
                if(answer < n){
                    answer = n;
                }
            }
        }
        return answer;
    }
}
 */