package level_1;

// 2026.04.18
// 서로 다른 포켓몬 종류 수와 선택 가능한 최대 개수를 비교해 최대로 고를 수 있는 종류 수를 구하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/1845

import java.util.HashSet;
import java.util.Set;

public class _001_폰켓몬 {
    public static void main(String[] args) {
        // 입력
        int[] nums = {3, 3, 3, 2, 2, 4};

        // 로직
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int answer = Math.min(set.size(), nums.length / 2);

        // 출력
        System.out.print(answer);
    }
}

/*
class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int answer = Math.min(set.size(), nums.length / 2);
        return answer;
    }
}
*/