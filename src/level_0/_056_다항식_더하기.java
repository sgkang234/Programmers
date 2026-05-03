package level_0;

// 2026.05.01
// 정수 배열이 주어질 때, 배열의 원소 중 두 개를 곱해 만들 수 있는 최대값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120863

public class _056_다항식_더하기 {
    public static void main(String[] args) {
        // 입력
        String polynomial = "3x + 7 + x";

        // 로직
        int xSum = 0;
        int numSum = 0;

        String[] arr = polynomial.split(" \\+ ");

        for (String s : arr) {
            if (s.contains("x")) {
                s = s.replace("x", "");

                if (s.equals("")) {
                    xSum += 1;   // "x"만 있는 경우
                } else {
                    xSum += Integer.parseInt(s);
                }
            } else {
                numSum += Integer.parseInt(s);
            }
        }

        String answer = "";

        if (xSum > 0) {
            if (xSum == 1) {
                answer += "x";
            } else {
                answer += xSum + "x";
            }
        }

        if (numSum > 0) {
            if (!answer.equals("")) {
                answer += " + ";
            }
            answer += numSum;
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(String polynomial) {
        int xSum = 0;
        int numSum = 0;

        String[] arr = polynomial.split(" \\+ ");

        for (String s : arr) {
            if (s.contains("x")) {
                s = s.replace("x", "");

                if (s.equals("")) {
                    xSum += 1;   // "x"만 있는 경우
                } else {
                    xSum += Integer.parseInt(s);
                }
            } else {
                numSum += Integer.parseInt(s);
            }
        }

        String answer = "";

        if (xSum > 0) {
            if (xSum == 1) {
                answer += "x";
            } else {
                answer += xSum + "x";
            }
        }

        if (numSum > 0) {
            if (!answer.equals("")) {
                answer += " + ";
            }
            answer += numSum;
        }
        return answer;
    }
}
 */
