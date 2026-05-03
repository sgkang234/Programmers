package level_0;

// 2026.05.02
// 삼각형의 두 변의 길이가 담긴 배열 sides이 주어질 때, 나머지 한 변이 될 수 있는 정수의 개수를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120868

import java.util.Arrays;

public class _059_삼각형의_완성조건_2 {
    public static void main(String[] args) {
        // 입력
        int[] sides = {11, 7};

        // 로직
        // 1. 입력되지 않은 값이 가징 긴 경우
        int x = 0;
        x = sides[0] + sides[1] -1;

        // 2. 입력된 한 변이 가장 긴 경우
        Arrays.sort(sides);
        int y = sides[1] - sides[0] + 1;
        int answer = x - y + 1;

        // 출력
        System.out.println(answer);
    }
}

/*
import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int x = 0;
        x = sides[0] + sides[1] -1;

        // 2. 입력된 한 변이 가장 긴 경우
        Arrays.sort(sides);
        int y = sides[1] - sides[0] + 1;
        int answer = x - y + 1;
        return answer;
    }
}
 */