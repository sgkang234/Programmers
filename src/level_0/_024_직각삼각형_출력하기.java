package level_0;

// 2026.04.21
// 문자열을 뒤집어 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120823

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _024_직각삼각형_출력하기 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}
 */