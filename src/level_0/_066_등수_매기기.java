package level_0;

// 2026.05.04
// 정수 n을 기준으로 n과 가까운 수부터 정렬한다. 만약 거리가 같다면 더 큰 수를 앞에 오도록한 뒤 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120882


public class _066_등수_매기기 {
    public static void main(String[] args) {
        // 입력
        int[][] score = {
                {80, 70},
                {90, 50},
                {40, 70},
                {50, 80}
        };

        // 로직
        int n = score.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int rank = 1;
            int sumI = score[i][0] + score[i][1];

            for (int j = 0; j < n; j++) {
                int sumJ = score[j][0] + score[j][1];

                if (sumJ > sumI) {
                    rank++;
                }
            }

            answer[i] = rank;
        }

        // 출력
        System.out.println(java.util.Arrays.toString(answer));

    }
}

/*
class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int rank = 1;
            int sumI = score[i][0] + score[i][1];

            for (int j = 0; j < n; j++) {
                int sumJ = score[j][0] + score[j][1];

                if (sumJ > sumI) {
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }
}
 */