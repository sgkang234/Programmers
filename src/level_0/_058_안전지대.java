package level_0;

// 2026.05.01
// 정수 배열이 주어질 때, 배열의 원소 중 두 개를 곱해 만들 수 있는 최대값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120866

public class _058_안전지대 {
    public static void main(String[] args) {
        // 입력
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        // 로직
        int n = board.length;
        int [][] danger = new int [n][n];

        // 8방향 + 자기 자신
        int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 1){
                    for (int k = 0; k < 9; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                            danger[nx][ny] = 1;
                        }
                    }
                }
            }
        }

        // 안전지역 개수 세기
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (danger[i][j] == 0) {
                    answer++;
                }
            }
        }

        // 출력
        System.out.println(answer);
    }
}
