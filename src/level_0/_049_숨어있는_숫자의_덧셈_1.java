package level_0;

// 2026.04.29
// my_string 안에 있는 숫자만 골라 더하여 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120851

public class _049_숨어있는_숫자의_덧셈_1 {
    public static void main(String[] args) {
        // 입력
        String my_string = "aAb1B2cC34oOp";

        // 로직
        int sum = 0;
        my_string = my_string.replaceAll("[^0-9]", "");
        for (int i = 0; i < my_string.length(); i++) {
            sum += my_string.charAt(i) - '0';
        }

        // 출력
        System.out.println(sum);
    }
}

/*
class Solution {
    public int solution(String my_string) {
        int sum = 0;
        my_string = my_string.replaceAll("[^0-9]", "");
        for (int i = 0; i < my_string.length(); i++) {
            sum += my_string.charAt(i) - '0';
        }
        return sum;
    }
}
 */