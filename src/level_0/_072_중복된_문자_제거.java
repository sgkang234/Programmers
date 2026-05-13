package level_0;

// 2026.05.13
// 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장한다. 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120888

import java.util.LinkedHashSet;
import java.util.Set;

public class _072_중복된_문자_제거 {
    public static void main(String[] args) {
        // 입력
        String my_string = "We are the world";


        // 로직
        String answer = "";
        Set<String> set = new LinkedHashSet<>(); // 순서를 유지하고, 중복을 막는다.
        for( int i = 0; i < my_string.length(); i++ ){
            set.add(String.valueOf(my_string.charAt(i)));
        }


        for (String s : set) {
            answer += s;
        }

        // 출력
        System.out.println(answer);
    }
}

/*
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        Set<String> set = new LinkedHashSet<>();
        for( int i = 0; i < my_string.length(); i++ ){
            set.add(String.valueOf(my_string.charAt(i)));
        }


        for (String s : set) {
            answer += s;
        }
        return answer;
    }
}
 */