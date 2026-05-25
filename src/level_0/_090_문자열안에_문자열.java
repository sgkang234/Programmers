package level_0;

// 2026.05.25
// 문자열 st1에 str2가 있다면 1을 없다면 2를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120908

public class _090_문자열안에_문자열 {
    public static void main(String[] args) {
        // 입력
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";

        // 로직
        int answer = 2;
        if (str1.contains(str2)) {
            answer = 1;
        }
        // 출력
        System.out.println(answer);

    }
}
