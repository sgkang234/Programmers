package level_0;

// 2026.06.01
// 문자열를 소문자로 바꾸고, 정렬하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120912

public class _094_7의_개수 {
    public static void main(String[] args) {
        // 입력
        int[] array = {7, 77, 16};
        
        // 로직
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            while (num > 0) {
                int temp = num % 10;
                num /= 10;
                if (temp == 7 ){
                   answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
