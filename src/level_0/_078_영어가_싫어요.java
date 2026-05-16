package level_0;

// 2026.05.16
// 대문자를 소문자로 소문자를 대문자로 변환한 문자열을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120894

public class _078_영어가_싫어요 {
    public static void main(String[] args) {
        // 입력
        String numbers = "onetwothreefourfivesixseveneightnine";

        // 로직
        String[] english = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        for (int i = 0; i < english.length; i++) {
            numbers = numbers.replace(english[i], String.valueOf(i));
        }

        long answer = Long.parseLong(numbers);

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public long solution(String numbers) {
        String[] english = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        for (int i = 0; i < english.length; i++) {
            numbers = numbers.replace(english[i], String.valueOf(i));
        }

        long answer = Long.parseLong(numbers);
        return answer;
    }
}
 */