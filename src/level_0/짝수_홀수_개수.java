package level_0;

// 2026.04.21
// 짝수와 홀수의 개수를 출려하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120824

public class 짝수_홀수_개수 {
    public static void main(String[] args) {
        // 입력
        int[] num_list = {1, 2, 3, 4, 5};

        // 로직
        int[] answer = {0, 0};
        for (int i : num_list){
            if(i % 2 == 0){
                answer[0]++;
            }else {
                answer[1]++;
            }
        }

        // 출력
        System.out.println(java.util.Arrays.toString(answer));
    }
}

/*
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        for (int i : num_list){
            if(i % 2 == 0){
                answer[0]++;
            }else {
                answer[1]++;
            }
        }
        return answer;
    }
}
 */