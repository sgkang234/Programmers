package level_1;

// 2026.05.13
// 1. 입력된 수가 짝수라면 2로 나눈다.
// 2. 입력된 수가 홀수라면 3을 곱하고 1을 더한다.
// 3. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복한다.
// 4. 반복된 횟수를 출력
// https://school.programmers.co.kr/learn/courses/30/lessons/12943

public class _025_콜라츠_추측 {
    public static void main(String[] args) {
        // 입력
        int n = 6;

        // 로직
        int answer = -1;
        for (int i = 0; i < 500; i++) { // 500번을 넘어가면 -1을 반환한다.
            if(n % 2 == 0 ){
                n /=2;
            } else {
                n *= 3;
                n += 1;
            }
            if(n == 1){
                answer = i;
                break;
            }
        }

        // 출력
        System.out.println(answer + 1);
    }
}

/*
class Solution {
    public int solution(int num) {

        long n = num;

        if (n == 1) {
            return 0;
        }

        for (int i = 0; i < 500; i++) {

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }

            if (n == 1) {
                return i + 1;
            }
        }

        return -1;
    }
}
 */