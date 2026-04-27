package level_0;

// 2026.04.27
// 구슬의 개수 balls와 구슬을 나누어 줄 구슬의 개수 share이 주어질 때, balls의 구슬 중 share의 구슬을 고르는 가능한 모든 수를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120841

public class _039_점의_위치_구하기 {
    public static void main(String[] args) {
        // 입력
        int[] dot = {1, 2};

        // 로직
        int answer = 0;
        int x = dot[0];
        int y = dot[1];

        if (x > 0 && y > 0){
            answer = 1;
        }
        else if (x < 0 && y > 0){
            answer = 2;
        }
        else if (x < 0 && y < 0){
            answer = 3;
        }else{
            answer = 4;
        }

        // 출력
        System.out.println(answer);


    }
}
