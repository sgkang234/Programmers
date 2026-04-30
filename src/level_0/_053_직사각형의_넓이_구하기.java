package level_0;

// 2026.04.29
// 직사격형의 넓이를 구하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120860

public class _053_직사각형의_넓이_구하기 {
    public static void main(String[] args) {
        // 입력
        int[][] dots = {
                {1, 1},
                {2, 1},
                {2, 2},
                {1, 2}
        };

        // 로직
        int minX = dots[0][0];
        int maxX = dots[0][0];
        int minY = dots[0][1];
        int maxY = dots[0][1];

        for (int i = 1; i < dots.length; i++) {
            minX = Math.min(minX, dots[i][0]);
            maxX = Math.max(maxX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
            maxY = Math.max(maxY, dots[i][1]);
        }

        int width = maxX - minX;
        int height = maxY - minY;
        int area = width * height;

        // 출력
        System.out.println(area);
    }
}

/*
class Solution {
    public int solution(int[][] dots) {
        int minX = dots[0][0];
        int maxX = dots[0][0];
        int minY = dots[0][1];
        int maxY = dots[0][1];

        for (int i = 1; i < dots.length; i++) {
            minX = Math.min(minX, dots[i][0]);
            maxX = Math.max(maxX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
            maxY = Math.max(maxY, dots[i][1]);
        }

        int width = maxX - minX;
        int height = maxY - minY;

        return width * height;
    }
}
 */