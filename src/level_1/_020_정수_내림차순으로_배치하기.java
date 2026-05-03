package level_1;

// 2026.05.01
// 정수 배열이 주어질 때, 배열의 원소 중 두 개를 곱해 만들 수 있는 최대값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12933

import java.util.Arrays;
import java.util.Collections;

public class _020_정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        // 입력
        long n = 118372;

        // 로직
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        String str = String.join("", arr);
        long answer = Long.parseLong(str);

        // 출력
        System.out.println(answer);

    }
}
