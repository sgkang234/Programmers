package level_1;

// 2026.04.18
// 문자열의 가운데 글자를 반환한다. 단 단어의 길이가 짝수라면 가운데 두글자를 반환하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12903

/*
[입력]
abcde
[출력]
c
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가운데_글자_가져오기 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // 로직
        String answer = "";
        if(s.length() % 2 == 0){
            answer = s.substring(s.length()/2 -1, s.length()/2 +1);
        } else{
            answer = String.valueOf(s.charAt(s.length()/2));
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0){
            answer = s.substring(s.length()/2 -1, s.length()/2 +1);
        } else{
            answer = String.valueOf(s.charAt(s.length()/2));
        }
        return answer;
    }
}
*/