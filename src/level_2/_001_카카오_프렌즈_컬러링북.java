package level_2;

// 2026.04.20
// 연결된 영역 개수 구하기 문제이기에 dfs로 풀어야 하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/1829

public class _001_카카오_프렌즈_컬러링북 {

    static int[][] picture;
    static boolean[][] visited;
    static int m, n;

    public static void main(String[] args) {
        // 입력
        m = 6;
        n = 4;
        // 여기서 숫자는 색이라고 보면 된다.
        picture = new int[][]{
                {1, 1, 1, 0},
                {1, 2, 2, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 3},
                {0, 0, 0, 3}
        };

        // 로직
        visited = new boolean[m][n];

        int numberOfArea = 0; // 같은 색끼리 모여 있는 횟수
        int maxSizeOfOneArea = 0; // 가장 넓이를 가지는 색의 크기

        // 전체 탐색
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 그림이 그려져 있고, 방문한 적이 없다면
                if(picture[i][j] != 0 && !visited[i][j]){
                    int size = dfs(i, j, picture[i][j]);
                    numberOfArea++;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, size);
                }
            }
        }
        System.out.println(numberOfArea + "\n" + maxSizeOfOneArea);
    }
    // (x, y)에서 시작해 같은 색 영역을 전부 탐색하고 크기를 리턴하는 함수
    static int dfs(int x, int y, int color){
        // 방문했기에 true로 바꾼다.
        visited[x][y] = true;
        // 초기 크기는 1이다.
        int size = 1;

        // 상하좌우를 탐색하기 위한 배열
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for (int i = 0; i < 4; i++) {
            int checkX = x + dx[i];
            int checkY = y + dy[i];

            // 이동하려는 위치의 picture[][]이 0보다 커야 하고, 배열의 크기를 벗어나면 안된다.
            if(checkX >= 0 && checkY >= 0 && checkX < m && checkY < n){
                // 방문한 적이 없어야 하며, 방문하려는 위치의 색이 현재 색과 같아야 한다.
                if(!visited[checkX][checkY] && picture[checkX][checkY] == color){
                    size += dfs(checkX, checkY, color);
                }
            }
        }
        return size;
    }
}
