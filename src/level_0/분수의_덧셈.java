package level_0;

// 2026.04.18
// 두 분수를 더한 뒤 기약분수로 만드는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120808

public class 분수의_덧셈 {
    public static void main(String[] args) {
        // 입력
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;

        // 로직
        int numer = (numer1*denom2) + (numer2*denom1);
        int denom = denom1*denom2;
        int gcd = gcd(numer, denom);
        int[] answer = { numer/gcd, denom/gcd};

        // 출력
        System.out.println("[" + answer[0] + ", " + answer[1]+ "]");
    }
    // gcd 메서드
    static int gcd(int a, int b){
        while (b !=0 ){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}

/*
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int gcd = gcd(numer, denom);

        return new int[]{numer / gcd, denom / gcd};
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
*/