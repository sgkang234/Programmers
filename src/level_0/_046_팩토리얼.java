package level_0;

// 2026.04.29
// 정수 n이 주어질 때 팩토리얼 중 n에 가장 근접한 정수 i를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120848

public class _046_팩토리얼 {
    public static void main(String[] args) {
        // 입력
        int n = 2;

        // 로직
        long mul = 1;
        int i = 1;
        while (true){
            mul *= i;

            if(mul > n){
                break;
            }

            i++;
        }

        // 입력
        System.out.println(i-1);
    }
}

/*
class Solution {
    public int solution(int n) {
        long mul = 1;
        int i = 1;
        while (true){
            mul *= i;

            if(mul > n){
                break;
            }

            i++;
        }
        return i-1;
    }
}
 */