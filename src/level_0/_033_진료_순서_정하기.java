package level_0;

// 2026.04.23
// 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120835

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _033_진료_순서_정하기 {
    public static void main(String[] args) {
        // 입력
        int[] emergency = {3, 76, 24};

        // 로직
        int[] sort = emergency.clone();
        Arrays.sort(sort);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sort.length; i++) {
            map.put(sort[i], sort.length - i);
        }

        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        // 출력
        System.out.println(Arrays.toString(answer));
    }
}

/*
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sort = emergency.clone();
        Arrays.sort(sort);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sort.length; i++) {
            map.put(sort[i], sort.length - i);
        }

        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        return answer;
    }
}
 */