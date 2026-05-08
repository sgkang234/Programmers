package level_0;

// 2026.05.04
// 정수 n을 기준으로 n과 가까운 수부터 정렬한다. 만약 거리가 같다면 더 큰 수를 앞에 오도록한 뒤 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120880

import java.util.Arrays;

public class _065_특이한_정렬 {
    public static void main(String[] args) {
        // 입력
        int[] numList = {1, 2, 3, 4, 5, 6};
        int n = 4;

        // 로직
        Integer[] arr = Arrays.stream(numList).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (a, b) -> {
            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);

            // 거리 기준
            if (distA != distB) {
                return distA - distB;
            }
            // 거리 같으면 큰 수 먼저
            return a - b;
        });

        // 출력
        System.out.println(Arrays.toString(arr));
    }
}


/*
class Solution {
    public int[] solution(int[] numList, int n) {
        Integer[] arr = Arrays.stream(numList).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, (a, b) -> {
            int diff = Math.abs(a - n) - Math.abs(b - n);
            return diff != 0 ? diff : b - a;
        });

        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
}
 */