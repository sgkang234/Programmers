package level_0;

// 2026.04.18
// 배열을 순회하며 특정 값과 같은 요소의 개수를 세는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120583

public class _1_중복된_숫자_개수 {
    public static void main(String[] args){
        // 입력
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;

        // 로직
        int answer = 0;
        for (int i : array) {
            if (n == i) {
                answer++;
            }
        }

        // 출력
        System.out.print(answer);
    }
}

/*
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
            for (int i : array) {
                if (n == i) {
                    answer++;
                }
            }
        return answer;
    }
}
*/