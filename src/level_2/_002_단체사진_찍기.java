package level_2;

// 2026.04.28
// 연결된 영역 개수 구하기 문제이기에 dfs로 풀어야 하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/1835

public class _002_단체사진_찍기 {

    static char[] friends = {'A','C','F','J','M','N','R','T'};
    static boolean[] visited = new boolean[8]; // 사용 여부
    static char[] arr = new char[8];       // 현재 줄 상태
    static int count = 0;                  // 정답

    public static void main(String[] args) {

        String[] conditions = {"N~F=0", "R~T>2"};
        dfs(0, conditions);
        System.out.println("정답: " + count);
    }

    // 줄 세우기 (DFS)
    static void dfs(int index, String[] conditions) {
        // 8명 다 채웠으면 검사
        if (index == 8) {
            if (isValidLine(conditions)) {
                count++;
            }
            return;
        }

        // 한 자리씩 사람 넣기
        for (int i = 0; i < 8; i++) {
            // 이미 방문했다면
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            arr[index] = friends[i];
            dfs(index + 1, conditions); // 다음 자리 채우기
            visited[i] = false; //
        }
    }

    // 2. 조건 검사
    static boolean isValidLine(String[] conditions) {

        for (String condition : conditions) {

            char person1 = condition.charAt(0);
            char person2 = condition.charAt(2);
            char operator = condition.charAt(3);
            int requiredGap = condition.charAt(4) - '0';

            int pos1 = findPosition(person1);
            int pos2 = findPosition(person2);

            int actualGap = Math.abs(pos1 - pos2) - 1;

            // 조건 체크
            if (operator == '=') {
                if (actualGap != requiredGap) return false;
            } else if (operator == '>') {
                if (actualGap <= requiredGap) return false;
            } else if (operator == '<') {
                if (actualGap >= requiredGap) return false;
            }
        }

        return true;
    }

    // 3. 특정 사람 위치 찾기
    static int findPosition(char person) {
        for (int i = 0; i < 8; i++) {
            if (arr[i] == person) {
                return i;
            }
        }
        return -1;
    }
}