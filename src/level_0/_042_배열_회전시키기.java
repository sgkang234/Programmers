package level_0;

// 2026.04.27
// 정수가 담긴 배열 numbers와 문자열 direction가 주어질때, direction의 방향으로 회전시킨 numbers의 배열을 출력하는 문제
// https://school.programmers.co.kr/learn/challenges?order=recent&page=10&languages=java&levels=0

public class _042_배열_회전시키기 {
    public static void main(String[] args) {
        // 입력
        int[] n = {4, 455, 6, 4, -1, 45, 6};
        String direction = "left";

        // 로직
        int[] answer = new int[n.length];

        if(direction.equals("left")){
            answer[n.length - 1] = n[0];
            for(int i = 1; i < n.length; i++){
                answer[i - 1] = n[i];
            }
        }

        if(direction.equals("right")){
            answer[0] = n[n.length - 1];
            for(int i = 0; i < n.length - 1; i++){
                answer[i + 1] = n[i];
            }
        }

        // 출력
        System.out.println(java.util.Arrays.toString(answer));
    }
}

/*
class Solution {
    public int[] solution(int[] n, String direction) {
        int[] answer = new int[n.length];

        if(direction.equals("left")){
            answer[n.length - 1] = n[0];
            for(int i = 1; i < n.length; i++){
                answer[i - 1] = n[i];
            }
        }

        if(direction.equals("right")){
            answer[0] = n[n.length - 1];
            for(int i = 0; i < n.length - 1; i++){
                answer[i + 1] = n[i];
            }
        }
        return answer;
    }
}
 */