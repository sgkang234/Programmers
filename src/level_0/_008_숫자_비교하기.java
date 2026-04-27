package level_0;

// 2026.04.18
// 두 정수가 같으면 1, 다르면 -1를 리턴하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120807

/*
[입력]
1
4
[출력]
-1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _008_숫자_비교하기 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        // 로직
        int answer = 0;
        if(num1 == num2){
            answer = 1;
        }else {
            answer = -1;
        }

        // 출력
        System.out.print(answer);

    }
}

/*
class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2){
            answer = 1;
        }else {
            answer = -1;
        }
        return answer;
    }
}
*/
