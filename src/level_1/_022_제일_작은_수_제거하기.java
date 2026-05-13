package level_1;

// 2026.05.04
// 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12935

import java.util.Arrays;

public class _022_제일_작은_수_제거하기 {
    public static void main(String[] args) {
        // 입력
        int[] arr = {4, 3, 2, 1};

        // 로직
        if(arr.length < 2) {
            System.out.println(Arrays.toString(new int[]{-1}));
            return;
        }

        int min = Arrays.stream(arr).min().getAsInt();

        int[] answer = new int[arr.length-1];
        int index = 0;
        for (int num : arr) {
            if (num != min){
                answer[index++] = num;
            }
        }

        // 출력
        System.out.println(Arrays.toString(answer));
    }
}

/*
class Solution {
    public int[] solution(int[] arr) {

        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        int[] answer = new int[arr.length - 1];
        int index = 0;

        for (int num : arr) {
            if (num != min) {
                answer[index++] = num;
            }
        }

        return answer;
    }
}
 */