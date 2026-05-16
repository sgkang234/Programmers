package level_0;

// 2026.05.16
// 문자열 s가 매개변수로 주어질 때, s에서 한 번만 등장하는 문자를 사전순으로 정렬하고 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120896

import java.util.Arrays;

public class _080_한_번만_등장한_문자 {
    public static void main(String[] args) {
        // 입력
        String s = "hello";

        // 로직
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(c == arr[j]){
                    s = s.replaceAll(String.valueOf(arr[i]), "");
                }
            }
        }
        // 정렬
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        s = String.valueOf(temp);

        // 출력
        System.out.println(s);
    }
}

/*
import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(c == arr[j]){
                    s = s.replaceAll(String.valueOf(arr[i]), "");
                }
            }
        }
        // 정렬
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        s = String.valueOf(temp);
        return s;
    }
}
 */