package level_0;

// 2026.04.28
// 약수의 개수가 세 개 이상인 수를 합성수라고 할 떄, n 이하의 합성수의 개수를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120846

import java.util.Arrays;

public class _044_합성수_찾기 {
    public static void main(String[] args) {
        // 입력
        int n = 10;

        // 로직
        Boolean[] isPrise = new Boolean[n+1];
        Arrays.fill(isPrise, true);
        isPrise[0] = isPrise[1] = false;

        for (int i = 2; i*i <= n; i++) {
            if(isPrise[i]== true){
                for (int j = i*i; j <= n; j+=i) {
                    isPrise[j] = false;
                }
            }
        }

        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (!isPrise[i]) { // 소수가 아니면 = 합성수
                answer++;
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int n) {
        Boolean[] isPrise = new Boolean[n+1];
        Arrays.fill(isPrise, true);
        isPrise[0] = isPrise[1] = false;

        for (int i = 2; i*i <= n; i++) {
            if(isPrise[i]== true){
                for (int j = i*i; j <= n; j+=i) {
                    isPrise[j] = false;
                }
            }
        }

        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (!isPrise[i]) { // 소수가 아니면 = 합성수
                answer++;
            }
        }
        return answer;
    }
}
 */