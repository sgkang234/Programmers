package level_0;

// 2026.05.18
// 정수 배열 array가 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120899

import java.util.Arrays;

public class _083_가장_큰_수_찾기 {
    public static void main(String[] args) {
        // 입력
        int [] array = {1, 8, 3};

        // 로직
        int[] answer = new int[2];
        answer[0] = array[0];
        answer[1] = 0;
        for (int i = 0; i < array.length; i++){
            if(answer[0] < array[i]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        // 출력
        System.out.println(Arrays.toString(answer));

    }
}
