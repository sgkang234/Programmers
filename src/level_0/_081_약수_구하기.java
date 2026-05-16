package level_0;

// 2026.05.16
// 10000 미만의 정수 n의 약수를 오름차순으로 구하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120897

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _081_약수_구하기 {
    public static void main(String[] args) {
        // 입력
        int n = 24;

        // 로직
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        // 출력
        System.out.println(Arrays.toString(answer));
    }
}

/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
 */