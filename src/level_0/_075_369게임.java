package level_0;

// 2026.05.16
// 입력한 숫자에 3, 6, 9 가 들어간 횟수를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120891

public class _075_369게임 {
    public static void main(String[] args) {
        // 입력
        int order = 29423;

        // 로직
        int answer = 0;
        while(order>0){
            int n = order%10;
            order = order/10;

            if(n == 3 || n == 6 || n == 9){
                answer++;
            }
        }

        // 출력
        System.out.println(answer);


    }
}

/*
class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order>0){
            int n = order%10;
            order = order/10;

            if(n == 3 || n == 6 || n == 9){
                answer++;
            }
        }
        return answer;
    }
}
 */
