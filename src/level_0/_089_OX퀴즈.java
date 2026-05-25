package level_0;

// 2026.05.25
// 수식이 맞으면 O, 틀리면 X를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120907

import java.util.Arrays;

public class _089_OX퀴즈 {
    public static void main(String[] args) {
        // 입력
        String[] quiz = {
                "3 - 4 = -1",
                "5 + 6 = 11"
        };

        // 로직
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int num1 =  Integer.parseInt(arr[0]);
            String operator = arr[1];
            int num2 = Integer.parseInt(arr[2]);
            int result = Integer.parseInt(arr[4]);

            int cal = 0;

            if(operator.equals("+")){
                cal = num1 + num2;
            }else {
                cal = num1 - num2;
            }

            if(cal == result){
                answer[i] = "O";
            } else{
                answer[i] = "X";
            }
        }

        // 출력
        System.out.println(Arrays.toString(answer));
    }
}

/*
class Solution {
    public String[] solution(String[] quiz) {

        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {

            String[] arr = quiz[i].split(" ");

            int num1 = Integer.parseInt(arr[0]);
            String operator = arr[1];
            int num2 = Integer.parseInt(arr[2]);
            int result = Integer.parseInt(arr[4]);

            int cal = 0;

            if (operator.equals("+")) {
                cal = num1 + num2;
            } else {
                cal = num1 - num2;
            }

            if (cal == result) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }

        return answer;
    }
}
 */
