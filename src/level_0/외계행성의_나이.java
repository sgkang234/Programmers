package level_0;

// 2026.04.23
// a는 0, b는 1, c는 2, ..., j는 9일 때, 나이를 입력했을 때, 이를 영어로 표현하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120834

import java.util.HashMap;
import java.util.Map;

public class 외계행성의_나이 {
    public static void main(String[] args) {
        // 입력
        int age = 23;

        // 로직
        String answer = "";
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put( i, (char)('a' + i));
        }
        while (age > 0) {
            int n = age % 10;
            answer = map.get(n) + answer;
            age /= 10;
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(int age) {
        String answer = "";
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put( i, (char)('a' + i));
        }
        while (age > 0) {
            int n = age % 10;
            answer = map.get(n) + answer;
            age /= 10;
        }
        return answer;
    }
}
 */