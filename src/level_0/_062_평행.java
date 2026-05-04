package level_0;

// 2026.05.03
// 점 네 개의 좌표를 담은 이차원 배열 dots이 주어질 때, 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1, 없으면 0
// https://school.programmers.co.kr/learn/courses/30/lessons/120875

public class _062_평행 {
    public static void main(String[] args) {
        // 입력
        int[][] dots = {
                {1, 4}, {9, 2}, {3, 8}, {11, 6}
        };

        // 로직
        int answer = 0;
        // 1. AB vs CD
        if (isTrue(dots[0], dots[1], dots[2], dots[3])) {
            answer = 1;
        }
        // 2. AC vs BD
        else if (isTrue(dots[0], dots[2], dots[1], dots[3])) {
            answer = 1;
        }
        // 3. AD vs BC
        else if (isTrue(dots[0], dots[3], dots[1], dots[2])) {
            answer = 1;
        }

        // 출력
        System.out.println(answer);


        // 출력
    }
    static boolean isTrue(int[] a, int[] b, int[] c, int[] d){
        if ((b[1] - a[1]) * (d[0] - c[0]) == (d[1] - c[1]) * (b[0] - a[0]) ){
            return true;
        } else {
            return false;
        }
    }
}

/*
class Solution {
    public int solution(int[][] dots) {
        if (isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        if (isParallel(dots[0], dots[3], dots[1], dots[2])) return 1;
        return 0;
    }

    static boolean isParallel(int[] a, int[] b, int[] c, int[] d) {
        return (b[1] - a[1]) * (d[0] - c[0]) ==
               (d[1] - c[1]) * (b[0] - a[0]);
    }
}
 */