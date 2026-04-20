package level_1;

// 2026.04.20
// 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12915

import java.util.Arrays;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        // 입력
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        // 로직
        Arrays.sort(strings, (a, b)->{
            if(a.charAt(n) == b.charAt(n)){
                return a.compareTo(b);
            }
            return a.charAt(n) - b.charAt(n);
        });

        // 출력
        System.out.println(java.util.Arrays.toString(strings));
    }
}

/*
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) ->{
            if(a.charAt(n) == b.charAt(n)){
                return a.compareTo(b);
            }
            return a.charAt(n) - b.charAt(n);
        });
        return strings;
    }
}
*/