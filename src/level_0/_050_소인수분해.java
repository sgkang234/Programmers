package level_0;

// 2026.04.29
// 정수 n을 소인수분해하고 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120852

import java.util.HashSet;
import java.util.Set;

public class _050_소인수분해 {
    public static void main(String[] args) {
        // 입력
        int n = 420;

        // 로직
        Set<Integer> set = new HashSet<>();
        int count = 2;
        while(n != 1){
            if(n % count == 0){
                set.add(count);
                n = n / count;
                count = 2;
                System.out.println(set);
            } else {
                count++;
            }
        }

        // 출력
        System.out.println(set);
    }
}

/*
class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        int count = 2;

        while (n != 1) {
            if (n % count == 0) {
                set.add(count);
                n = n / count;
                count = 2;
            } else {
                count++;
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
 */