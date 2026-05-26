package level_0;

// 2026.05.26
// 문자열를 소문자로 바꾸고, 정렬하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120911

import java.util.Arrays;

public class _093_문자열_정렬하기_2 {
    public static void main(String[] args) {
        // 입력
        String my_string = "Bcad";

        // 로직
        String[] arr = my_string.split("");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
        }
        Arrays.sort(arr);

        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        // 출력
        System.out.println(answer);

    }
}

/*
import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
        }
        Arrays.sort(arr);

        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}
 */