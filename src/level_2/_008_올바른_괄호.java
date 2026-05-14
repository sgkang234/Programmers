package level_2;

// 2026.05.14
// 괄호의 짝이 올바른지 판별하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12909

import java.util.Stack;

public class _008_올바른_괄호 {
    public static void main(String[] args) {
        // 입력
        String s = "()()";

        // 로직
        Stack<Character> stack = new Stack<>();

        boolean answer = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c=='('){
                stack.push(c);
            } else{
                if(stack.isEmpty()){
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            answer = false;
        }

        // 출력
        System.out.println(answer);
    }
}
