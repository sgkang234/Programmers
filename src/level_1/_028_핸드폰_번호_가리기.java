package level_1;

// 2026.05.20
// 뒷자리 4개만 남기고 다 '*'로 변환하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12948

public class _028_핸드폰_번호_가리기 {
    public static void main(String[] args) {
        // 입력
        String phone = "01012345678";

        // 로직
        String answer = "";
        for (int i = 0; i < phone.length() - 4; i++) {
            answer += "*";
        }
        for (int i = phone.length() - 4; i < phone.length(); i++) {
            answer += phone.charAt(i);
        }

        // 출력
        System.out.println(answer);
    }
}
/*
class Solution {
    public String solution(String phone) {
        String answer = "";
        for (int i = 0; i < phone.length() - 4; i++) {
            answer += "*";
        }
        for (int i = phone.length() - 4; i < phone.length(); i++) {
            answer += phone.charAt(i);
        }
        return answer;
    }
}
 */
