package level_0;

// 2026.05.13
// 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장한다. 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120887

public class _071_k의_개수 {
    public static void main(String[] args) {
        // 입력
        int i = 1;
        int j = 13;
        int k = 1;

        // 로직
        String ks = String.valueOf(k);
        int answer = 0;
        for (int l = i; l <= j; l++) {
            String s = String.valueOf(l);

            for (int m = 0; m < s.length(); m++) {
                if (String.valueOf(s.charAt(m)).equals(ks)) {
                    answer++;
                }
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int i, int j, int k) {
        String ks = String.valueOf(k);
        int answer = 0;
        for (int l = i; l <= j; l++) {
            String s = String.valueOf(l);

            for (int m = 0; m < s.length(); m++) {
                if (String.valueOf(s.charAt(m)).equals(ks)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
 */