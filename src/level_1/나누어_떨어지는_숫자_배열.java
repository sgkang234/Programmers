package level_1;

// 2026.04.19
// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12910

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        // 입력
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        // 로직
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i % divisor == 0){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
            System.out.println(list);
        }
        Collections.sort(list);

        System.out.println(list);
    }
}

/*
public class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
*/