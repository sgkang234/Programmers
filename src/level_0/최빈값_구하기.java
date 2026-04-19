package level_0;

// 2026.04.19
// 배열에서 가장 많이 나오는 정수를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120812

import java.util.HashMap;
import java.util.Map;

public class 최빈값_구하기 {
    public static void main(String[] args) {
        // 입력
        int[] array = {1, 2, 3, 3, 3, 4};

        // 로직
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : array){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int max = 0;
        int answer = -1;

        for(int i : map.keySet()){
            int count = map.get(i);
            if (count > max) {
                max = count;
                answer = i;
            } else if (count == max) {
                answer = -1; // 중복 최빈값
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int max = 0;
        int answer = -1;

        for (int i : map.keySet()) {
            int count = map.get(i);

            if (count > max) {
                max = count;
                answer = i;
            } else if (count == max) {
                answer = -1;
            }
        }
        return answer;
    }
}
*/