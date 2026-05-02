package level_0;

// 2026.05.01
// 정수 배열이 주어질 때, 배열의 원소 중 두 개를 곱해 만들 수 있는 최대값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120864

public class _057_숨어있는_숫자의_덧셈_2 {
    public static void main(String[] args) {
        // 입력
        String my_string = "aAb1B2cC34oOp";

        // 로직
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]", " ");
        String[] arr = str.split(" ");
        for (String s : arr) {
            if (!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }

        // 출력
        System.out.println(answer);
    }
}
