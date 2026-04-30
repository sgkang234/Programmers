package level_0;

// 2026.04.29
//
// https://school.programmers.co.kr/learn/courses/30/lessons/120861

public class _054_캐릭터의_좌표 {
    public static void main(String[] args) {
        // 입력
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};

        // 로직
        int x = 0;
        int y = 0;

        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        for (String key : keyinput) {
            if (key.equals("left") && x > -maxX) {
                x--;
            } else if (key.equals("right") && x < maxX) {
                x++;
            } else if (key.equals("up") && y < maxY) {
                y++;
            } else if (key.equals("down") && y > -maxY) {
                y--;
            }
        }

        // 출력
        System.out.println(x + ", " + y);
    }
}

/*
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0;

        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        for (String key : keyinput) {
            if (key.equals("left") && x > -maxX) {
                x--;
            } else if (key.equals("right") && x < maxX) {
                x++;
            } else if (key.equals("up") && y < maxY) {
                y++;
            } else if (key.equals("down") && y > -maxY) {
                y--;
            }
        }

        return new int[]{x, y};
    }
}
 */