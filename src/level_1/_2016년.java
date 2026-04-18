package level_1;

// 2026.04.18
// 2016년 특정 날짜의 요일을 계산하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12901

public class _2016년 {
    public static void main(String[] args) {
        // 입력
        int a = 5;
        int b = 24;

        // 로직
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int total = 0;
        // 이전 달까지의 합
        for (int i = 0; i < a-1; i++) {
            total += month[i];
        }
        total += b-1; // 1월 1일이 기준일이기에 -1을 해준다.
        String answer = days[(total + 5) % 7]; // 1월 1일이 금요일이기에 5를 더한다

        System.out.println(answer);
    }
}
