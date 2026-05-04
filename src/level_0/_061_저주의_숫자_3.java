package level_0;

// 2026.05.03
// 3을 사용하지 않는 진법을 만드는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120871

public class _061_저주의_숫자_3 {
    public static void main(String[] args) {
        // 입력
        int n = 40; // 1 <= n <= 100

        // 로직
        int count = 0;
        int answer = 0;
        for (int i = 0; i < 100 ; i++) {
            String str = String.valueOf(i);
            if( !(str.contains("3")) && !(i%3 == 0) ) {
                count++;
            }
            if(count == n){
                answer = i;
                break;
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int n) {
        int count = 0;
        int answer = 0;
        for (int i = 0; i < Integer.MAX_VALUE ; i++) {
            String str = String.valueOf(i);
            if( !(str.contains("3")) && !(i%3 == 0) ) {
                count++;
            }
            if(count == n){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
 */