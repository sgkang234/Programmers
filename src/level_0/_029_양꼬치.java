package level_0;

// 2026.04.23
// 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍다고 할 때, 양꼬치는 1인분에 12,000원, 음료수는 2,000원일 때 가격을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120830

public class _029_양꼬치 {
    public static void main(String[] args) {
        // 입력
        int n = 10;
        int k = 3;

        // 로직
        int service = n/10;
        if(k > 0) {
            k -= service;
        }
        int answer = n *12000 + k * 2000;

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int n, int k) {
        int service = n/10;
        System.out.println(service);
        if(k > 0) {
            k -= service;
        }
        int answer = n *12000 + k * 2000;
        return answer;
    }
}
 */