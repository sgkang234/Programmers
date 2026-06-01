package level_1;

// 2026.06.01
// 직사각형 별 찍기어서 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12969

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _031_직사각형_별찍기 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int last = Integer.parseInt(st.nextToken());

        // 로직
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < last; i++){
            for(int j = 0; j < first; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        int last = Integer.parseInt(st.nextToken());

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < last; i++) {
            for (int j = 0; j < first; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
 */