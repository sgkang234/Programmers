package level_1;

// 2026.05.26
// 행렬끼리의 순서를 더한 값
// https://school.programmers.co.kr/learn/courses/30/lessons/12954

import java.util.ArrayList;
import java.util.List;

public class _030_x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        // 입력
        int x = -4;
        int n = 3;

        // 로직
        int num = x;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(num);
            num += x;
        }

        // 출력
        System.out.println(list);
    }
}

/*
class Solution {
    public long[] solution(int x, int n) {

        long[] answer = new long[n];

        long num = x;

        for (int i = 0; i < n; i++) {
            answer[i] = num;
            num += x;
        }

        return answer;
    }
}
 */