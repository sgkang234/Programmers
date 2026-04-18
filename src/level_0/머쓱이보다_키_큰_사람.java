package level_0;

// 2026.04.18
// 주어진 배열에서 특정 값보다 큰 요소의 개수를 세는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120585

public class 머쓱이보다_키_큰_사람 {
    public static void main(String[] args) {
        // 입력 
        int[] array = {149, 180, 192, 170};
        int height = 167;

        // 로직 
        int answer = 0;
        for (int i : array) {
            if(height < i){
                answer++;
            }
        }
        
        // 출력
        System.out.print(answer);
    }
}

/*
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i : array) {
            if(height < i){
                answer++;
            }
        }
        return answer;
    }
}
 */