package level_0;

// 2026.04.19
// 피자를 일곱 조각을 나눠 먹을 때 피자를 한 조각 이상 먹기 위한 필요한 피자의 수를 구하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120814

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _015_피자_나눠_먹기_1 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 로직
        int answer = n / 7;
        if (n % 7 != 0) {
            answer++;
        }

        // 출력
        System.out.println(answer);
    }
}
