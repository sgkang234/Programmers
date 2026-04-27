package level_0;

// 2026.04.20
// 아이스 아메리카노는 한잔에 5,500원이며, 가지고 있는 money가 주어질 때, 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120819

public class _020_아이스_아메리카노 {
    public static void main(String[] args) {
        // 입력
        int money = 15000;

        // 로직
        int coffeePrice = 5500; // 커피 가격
        int num = money / coffeePrice;
        int change = money % coffeePrice;
        int[] answer = {num, change};

        // 출력
        System.out.println(java.util.Arrays.toString(answer));
    }
}

/*
class Solution {
    public int[] solution(int money) {
        int coffeePrice = 5500; // 커피 가격
        int num = money / coffeePrice;
        int change = money % coffeePrice;
        int[] answer = {num, change};
        return answer;
    }
}
*/