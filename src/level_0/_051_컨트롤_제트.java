package level_0;

// 2026.04.29
// 문자열로 숫자와 하나의 Z를 입력받고 모든 수를 더하는데 Z가 나왔다면 앞의 숫자를 뺸다, 이후 값을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120853

import java.util.Arrays;

public class _051_컨트롤_제트 {
    public static void main(String[] args) {
        // 입력
        String s = "1 2 Z 3";

        // 로직
        String[] arr = s.split(" ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("Z")){
                sum -= Integer.parseInt(arr[i-1]);
            }else {
                sum += Integer.parseInt(arr[i]);
            }
        }

        // 출력
        System.out.println(sum);
    }
}

/*
class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("Z")){
                sum -= Integer.parseInt(arr[i-1]);
            }else {
                sum += Integer.parseInt(arr[i]);
            }
        }
        return sum;
    }
}
 */
