package level_0;

// 2026.05.13
// 삼각형인지 판별하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120889

import java.util.Arrays;

public class _073_삼각형의_완성조건_1 {
    public static void main(String[] args) {
        // 입력
        int[] sides = {1, 2, 3};

        // 로직
        Arrays.sort(sides);

        int answer = 2;
        if (sides[0] + sides[1] > sides[2]) {
            answer = 1;
        }


        // 출력
        System.out.println(answer);
    }
}
