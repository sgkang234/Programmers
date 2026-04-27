package level_2;

// 2026.04.27
// 최단거리 문제이기에 bfs로 풀어야 하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/1844

import java.util.LinkedList;
import java.util.Queue;

public class _003_게임_맵_최단거리 {
    public static void main(String[] args) {
        // 입력
        int[][] maps = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}
        };

        // 로직
        int n = maps.length; // 행
        int m = maps[0].length; // 열
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        // 좌표(x, y)를 저장하는 큐
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});

        while(!q.isEmpty()){
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int checkX = x + dx[i];
                int checkY = y + dy[i];

                // 범위를 벗어나면 나간다.
                if(checkX < 0 || checkY < 0  || checkX >= n || checkY >= m){
                    continue;
                }
                // 0일 경우 방문 자체를 하지 않아도 된다.
                if(maps[checkX][checkY] == 0){
                    continue;
                }

                // 방문 안한 길이면
                if (maps[checkX][checkY] == 1) {
                    maps[checkX][checkY] = maps[x][y] + 1; // 거리 누적
                    q.offer(new int[]{checkX, checkY});
                }
            }
        }
        // 출력
        if (maps[n-1][m-1] == 1) {
            System.out.println(-1);
        } else {
            System.out.println(maps[n-1][m-1]);
        }
    }
}
