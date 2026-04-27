package level_0;

// 2026.04.27
// 정수 배열 num_list와 정수 n이 주어질 때, num_list를 n차원 배열로 바꿔 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120842

public class _040_2차원으로_만들기 {
    public static void main(String[] args) {
        // 입력
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;

        // 로직
        int num = num_list.length/n;
        int[][] answer = new int[num][n];
        int count = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[count];
                count++;
            }
        }
        // 출력
        System.out.println(java.util.Arrays.deepToString(answer));
    }
}

/*
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int num = num_list.length/n;
        int[][] answer = new int[num][n];
        int count = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[count];
                count++;
            }
        }
        return answer;
    }
}
 */
