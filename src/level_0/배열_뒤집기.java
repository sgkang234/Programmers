package level_0;

// 2026.04.21
// 배열을 뒤집어 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120821

public class 배열_뒤집기 {
    public static void main(String[] args) {
        // 입력
        int[] num_list = {1, 2, 3, 4, 5};

        // 로직
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length-i-1];
        }

        // 출력
        System.out.println(java.util.Arrays.toString(answer));
    }
}

/*
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length-i-1];
        }
        return answer;
    }
}
 */