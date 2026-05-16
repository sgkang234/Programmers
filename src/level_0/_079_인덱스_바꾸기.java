package level_0;

// 2026.05.16
// 문자열의 두 인덱스 위치 문자를 서로 바꾸는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120895

public class _079_인덱스_바꾸기 {
    public static void main(String[] args) {
        // 입력
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;

        // 로직
        char[] arr = my_string.toCharArray();

        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

        String answer = String.valueOf(arr);

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();

        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

        String answer = String.valueOf(arr);
        return answer;
    }
}
 */