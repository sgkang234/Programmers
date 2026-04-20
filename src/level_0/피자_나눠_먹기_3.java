package level_0;

// 2026.04.20
// 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120816

public class 피자_나눠_먹기_3 {
    public static void main(String[] args) {
        // 입력
        int slice = 7;
        int n = 10;

        // 로직
        int answer = n / slice;
        n %=slice;
        if(n != 0){
            answer++;
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int slice, int n) {
        int answer = n / slice;
        n %=slice;
        if(n != 0){
            answer++;
        }
        return answer;
    }
}
*/