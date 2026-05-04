package level_0;

// 2026.05.04
// 선분 3개가 놓여 있을 때, 2개 이상 겹치는 부분의 길이를 출력하는 단 양 끝점은 -100 ≤ a < b ≤ 100 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120876

import java.util.Arrays;

public class _063_겹치는_선분의_길이 {
    public static void main(String[] args) {
        // 입력
        int[][] line = {{0, 5}, {3, 9}, {1, 10}};

        // 로직
        int[] arr = new int[200 + 1];
        Arrays.fill(arr, 0);
        for(int i = 0; i < line.length; i++){
            for(int j = line[i][0]; j <line[i][1] ; j++){
                    arr[j+100]++;
            }
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >1){
                count++;
            }
        }
        // 출력
        System.out.println(count);
    }
}

/*
class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201];

        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                arr[j + 100]++;
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) count++;
        }

        return count;
    }
}
 */
