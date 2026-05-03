package level_0;

// 2026.05.02
// spell에 담긴 알파벳을 모두 한 번씩 사용해서 만들 수 있는 단어가
// dic 배열 안에 존재하면 1, 없으면 2를 반환하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120869

import java.util.Arrays;

public class _060_외계어_사전 {
    public static void main(String[] args) {
        // 입력
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};

        // 로직
        int answer = 2;

        for (String word : dic) {
            boolean check = true;

            for (String s : spell) {
                if (!word.contains(s)) {
                    check = false;
                    break;
                }
            }

            if (check && word.length() == spell.length) {
                answer = 1;
                break;
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String word : dic) {
            boolean check = true;

            for (String s : spell) {
                if (!word.contains(s)) {
                    check = false;
                    break;
                }
            }

            if (check && word.length() == spell.length) {
                return 1;
            }
        }
        return 2;
    }
}
 */