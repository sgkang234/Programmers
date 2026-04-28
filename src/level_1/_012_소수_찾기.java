package level_1;

// 2026.04.26
// 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12921

import java.util.Arrays;

public class _012_소수_찾기 {
    public static void main(String[] args) {
        // 입력
        int n = 10;

        // 로직
        int answer = 0;
        boolean[] check = new boolean[n+1];
        Arrays.fill(check, true);
        check[0] = false;
        check[1] = false;

        // 에라토스테네스의 체
        for (int i = 2; i * i <= n; i++) {
            if (check[i]) {
                for (int j = i * i; j <= n; j += i) {
                    check[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(check[i]){
               answer++;
            }
        }

        // 출력
        System.out.println(answer);
    }
}
