package level_0;

// 2026.04.27
// 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 때, k번째 던지는 사람의 위치를 구하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120843

public class _041_공_던지기 {
    public static void main(String[] args) {
        // 입력
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int k = 5;

        // 로직
        int index = (k - 1) * 2 % numbers.length;

        // 출력
        System.out.println(numbers[index]);
    }
}

/*
class Solution {
    public int solution(int[] numbers, int k) {

        int index = (k - 1) * 2 % numbers.length;
        int answer = numbers[index];
        return answer;
    }
}
 */