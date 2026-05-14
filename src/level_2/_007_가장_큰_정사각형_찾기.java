package level_2;

// 2026.05.14
// 1로 이루어진 가장 큰 정사각형의 넓이를 구하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12905

public class _007_가장_큰_정사각형_찾기 {
    public static void main(String[] args) {
        // 입력
        int[][] board = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 1, 0}
        };

        // 로직
        // 행, 열 크기를 저장한다.
        int row = board.length;
        int col = board[0].length;

        // 가장 큰 정사각형 한 변의 길이
        int max = 0;

        // 아래 2개의 검사는 정사각형의 크기가 첫 번째 열, 벗 번째 행에만 있어 크기가 1인 경우를 포함하기 위한 코드
        // 첫 번째 열 검사
        for (int i = 0; i < row; i++) {
            max = Math.max(max, board[i][0]);
        }

        // 첫 번째 행 검사
        for (int j = 0; j < col; j++) {
            max = Math.max(max, board[0][j]);
        }

        // 위, 왼쪽, 왼쪽 위 대각선 중 최소값 + 1
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {

                // 현재 칸이 1일 때만 정사각형 검사
                if (board[i][j] == 1) {

                    // 현재 칸에서 위, 왼쪽, 왼쪽 위가 모두 1일 경우 현재 칸이 2가 된다 이걸 반복
                    board[i][j] = Math.min(
                            Math.min(board[i - 1][j], board[i][j - 1]),
                            board[i - 1][j - 1]
                    ) + 1;

                    // 최대 길이 갱신
                    max = Math.max(max, board[i][j]);
                }
            }
        }
        // 출력
        System.out.println(max * max);
    }
}
