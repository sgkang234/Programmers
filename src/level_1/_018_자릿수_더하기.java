package level_1;

// 2026.05.01
// 자연수 n의 각 자릿수의 합을 구해서 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12931

public class _018_자릿수_더하기 {
    public static void main(String[] args) {
        // 입력
        int n = 123;

        // 로직
        int sum = 0;
        while (n >0){
            sum += n % 10;
            n /= 10;
        }

        // 출력
        System.out.println(sum);
    }
}
