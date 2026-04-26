package level_0;

// 2026.04.26
// 모스부호로 문자열 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120838

public class 모스부호_1 {
    public static void main(String[] args) {
        // 입력
        String letter = "... --- ...";

        // 로직
        StringBuilder answer = new StringBuilder();
        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--","--.."
        };

        for (String s : letter.split(" ")) {
            for (int i = 0; i < morse.length; i++) {
                if (s.equals(morse[i])) {
                    answer.append((char)(i + 'a'));
                    break;
                }
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--","--.."
        };

        for (String s : letter.split(" ")) {
            for (int i = 0; i < morse.length; i++) {
                if (s.equals(morse[i])) {
                    answer.append((char)(i + 'a'));
                    break;
                }
            }
        }
        return answer.toString();
    }
}
 */