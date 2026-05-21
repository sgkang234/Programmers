package level_0;

// 2026.05.21
// 중복된 값이 없는 두 배열의 같은 원소의 개수를 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120903

public class _085_배열의_유사도 {
    public static void main(String[] args) {
        // 입력
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        // 로직
        int sum = 0;
        for(String outS  : s1){
            for(String inS : s2){
                if(outS.equals(inS)){
                    sum++;
                }
            }
        }

        // 출력
        System.out.println(sum);
    }
}

/*
class Solution {
    public int solution(String[] s1, String[] s2) {
        int sum = 0;
        for(String outS  : s1){
            for(String inS : s2){
                if(outS.equals(inS)){
                    sum++;
                }
            }
        }
        return sum;
    }
}
*/