package level_1;

// 2026.04.18
// 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12906

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) {
        // 입력
        int[] arr = {1,1,3,3,0,1,1};

        // 로직
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]){
                answer.add(arr[i]);
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]){
                answer.add(arr[i]);
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}
*/