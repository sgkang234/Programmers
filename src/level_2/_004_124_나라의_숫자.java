package level_2;

// 2026.04.27
// 0 없는 k진법 만들기 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12899

public class _004_124_나라의_숫자 {
    public static void main(String[] args) {
        // 입력
        int n = 12;

        // 로직
        String answer = "";
        while (n > 0) {
            int remainder = n % 3; // 나올 수 있는 값 0, 1, 2

            if (remainder == 0) { // (3, 6, 9) 의 나머지
                answer = "4" + answer;
                n = (n / 3) - 1; // 0, 1, 2 가 아닌, 1, 2, 4 이기에
            } else if (remainder == 1) { // (1, 4, 7, 10) 의 나머지
                answer = "1" + answer;
                n = n / 3;
            } else if (remainder == 2) { // (2, 5, 8) 의 나머지
                answer = "2" + answer;
                n = n / 3;
            }
        }

        // 출력
        System.out.println(answer);
    }
}


/*
// 역변환
public static void main(String[] args) {
        String num = "44";
        int answer = 0;

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);

            int value = 0;
            if (c == '1') value = 1;
            else if (c == '2') value = 2;
            else if (c == '4') value = 3;

            answer = answer * 3 + value;
        }
        System.out.println(answer);
    }
*/

/*
class Solution {
    public String solution(int n) {
        String answer = "";
        while (n > 0) {
            int remainder = n % 3; // 나올 수 있는 값 0, 1, 2

            if (remainder == 0) { // (3, 6, 9) 의 나머지
                answer = "4" + answer;
                n = n / 3 - 1;
            } else if (remainder == 1) { // (1, 4, 7, 10) 의 나머지
                answer = "1" + answer;
                n = n / 3;
            } else if (remainder == 2) { // (2, 5, 8) 의 나머지
                answer = "2" + answer;
                n = n / 3;
            }
        }
        return answer;
    }
}
 */