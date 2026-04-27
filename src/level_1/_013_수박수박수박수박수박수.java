package level_1;

// 2026.04.23
// 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12922

public class _013_수박수박수박수박수박수 {
    public static void main(String[] args) {
        // 입력
        int n = 3;

        // 로직
        String answer = "";
        for (int i = 0; i < n / 2; i++) {
            answer += "수박";
        }

        if(n % 2 != 0){
            answer+= "수";
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n / 2; i++) {
            answer += "수박";
        }

        if(n % 2 != 0){
            answer+= "수";
        }
        return answer;
    }
}
 */