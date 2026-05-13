package level_1;

// 2026.05.13
// 정수를 담고 있는 배열 arr의 평균값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12944

public class _026_평균_구하기 {
    public static void main(String[] args) {
        // 입력
        int[] arr = {1, 2, 3, 4, 5};

        // 로직
        double sum = 0 ;
        for(int n : arr){
            sum += n;
        }
        double answer = sum/arr.length;

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public double solution(int[] arr) {
        double sum = 0 ;
        for(int n : arr){
            sum += n;
        }

        double answer = sum/arr.length;
        return answer;
    }
}
 */