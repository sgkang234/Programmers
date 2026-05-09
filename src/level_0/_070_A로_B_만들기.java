package level_0;

// 2026.05.09
// before의 알파벳을 섞어서 after를 만들 수 있는지 판별하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120886

import java.util.Arrays;

public class _070_A로_B_만들기 {
    public static void main(String[] args) {
        // 입력
        String before = "olleh";
        String after = "hello";

        // 로직
        char[] arr1 = before.toCharArray();;
        char[] arr2 = after.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int answer = Arrays.equals(arr1, arr2) ? 1 : 0;

        // 출력
        System.out.println(answer);
    }
}
