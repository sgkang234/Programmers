package level_0;

// 2026.05.18
// my_string은 "3 + 5"처럼 문자열로 된 수식일 때 이를 계산한 값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120902

public class _084_문자열_계산하기 {
    public static void main(String[] args) {
        // 입력
        String my_string = "3 + 4";

        // 로직
        String[] arr = my_string.split(" ");

        int answer = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i += 2) {

            if (arr[i].equals("+")) {
                answer += Integer.parseInt(arr[i + 1]);
            } else {
                answer -= Integer.parseInt(arr[i + 1]);
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");

        int answer = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i += 2) {

            if (arr[i].equals("+")) {
                answer += Integer.parseInt(arr[i + 1]);
            } else {
                answer -= Integer.parseInt(arr[i + 1]);
            }
        }
        return answer;
    }
}
 */