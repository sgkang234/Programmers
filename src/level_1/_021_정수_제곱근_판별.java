package level_1;

// 2026.05.03
// 정수 n이 주어질 때, n이 어떤 양의 정수 x의 제곱이라면 x+1을 제곱해 리턴하고 아니라면 -1을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12934

public class _021_정수_제곱근_판별 {
    public static void main(String[] args) {
        // 입력
        long n = 121;

        // 로직
        long answer = -1;
        for (long i = 1; i <= (long)Math.sqrt(n); i++) {
            if(i * i == n){
                answer = (i+1) *(i+1);
                break;
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public long solution(long n) {
        long answer = -1;
        for (long i = 1; i <= (long)Math.sqrt(n); i++) {
            if(i * i == n){
                answer = (i+1) *(i+1);
                break;
            }
        }
        return answer;
    }
}
 */