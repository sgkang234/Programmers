package level_1;

// 2026.04.23
// 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인하고 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12918

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _010_문자열_다루는_기본 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s =  br.readLine();

        // 로직
        boolean answer = false;
        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                    answer = false;
                    break;
                }
            }
        }

        // 출력
        System.out.println(answer);
    }
}
