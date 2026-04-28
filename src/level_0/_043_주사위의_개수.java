package level_0;

// 2026.04.28
// 직육면체 상자에 들가는 정사각형의 주사위의 개수를 구하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120845

public class _043_주사위의_개수 {
    public static void main(String[] args) {
        // 입력
        int[] box = {10, 8, 6}; // 가로, 세로, 높이 길이
        int n = 3; // 주사위 길이

        // 로직
        int maxWidth = box[0]/n;
        int maxLength = box[1]/n;
        int maxHeight = box[2]/n;
        int answer= maxWidth*maxLength*maxHeight;

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int[] box, int n) {
        int maxWidth = box[0]/n;
        int maxLength = box[1]/n;
        int maxHeight = box[2]/n;
        int answer= maxWidth*maxLength*maxHeight;
        return answer;
    }
}
 */