package level_0;

// 2026.04.23
// 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류하고 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120829

public class _028_각도기 {
    public static void main(String[] args) {
        // 입력
        int angle = 91;

        // 로직
        int answer = 0;
        if(angle > 0 && angle < 90){
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle > 90 && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle > 0 && angle < 90){
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle > 90 && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }
        return answer;
    }
}
 */