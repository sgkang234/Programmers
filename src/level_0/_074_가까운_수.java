package level_0;

// 2026.05.16
// 가장 가까운 수를 찾는 문제, 거리가 같다면 더 작은 수를 고른다.
// https://school.programmers.co.kr/learn/courses/30/lessons/120890

public class _074_가까운_수 {
    public static void main(String[] args) {
        // 입력
        int[] array = {3, 10, 28};
        int n = 20;

        // 로직
        int minDiff = Integer.MAX_VALUE;
        int answer = 0;
        for (int num : array) {
            int diff = Math.abs(n - num);

            if (diff < minDiff) {
                minDiff = diff;
                answer = num;
            }

            // 거리가 같다면 더 작은 수 선택
            else if (diff == minDiff) {
                answer = Math.min(answer, num);
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int[] array, int n) {
        int minDiff = Integer.MAX_VALUE;
        int answer = 0;
        for (int num : array) {
            int diff = Math.abs(n - num);

            if (diff < minDiff) {
                minDiff = diff;
                answer = num;
            }

            // 거리가 같다면 더 작은 수 선택
            else if (diff == minDiff) {
                answer = Math.min(answer, num);
            }
        }
        return answer;
    }
}
 */