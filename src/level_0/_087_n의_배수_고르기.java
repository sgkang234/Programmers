package level_0;

// 2026.05.22
// 입력한 값의 배수만 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120905

import java.util.ArrayList;
import java.util.List;

public class _087_n의_배수_고르기 {
    public static void main(String[] args) {
        // 입력
        int n = 3;
        int[] list = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        // 로직
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < list.length; i++) {
            if (list[i] % n == 0) {
                answerList.add(list[i]);
            }
        }

        // 출력
        System.out.println(answerList);
    }
}

/*
class Solution {
    public int[] solution(int n, int[] numlist) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                list.add(numlist[i]);
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