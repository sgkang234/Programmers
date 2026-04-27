package level_0;

// 2026.04.20
// 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해 줄때의 가격
// https://school.programmers.co.kr/learn/courses/30/lessons/120818

public class _019_옷가게_할인_받기 {
    public static void main(String[] args) {
        // 입력
        int price = 580000;

        // 로직
        int answer = price;
        if(price >= 100000 && price < 300000){
            answer = (int)(price * 0.95);
        } else if(price >= 300000 && price < 500000){
            answer = (int)(price * 0.9);
        } else if(price >= 500000){
            answer = (int)(price * 0.8);
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public int solution(int price) {
        if(price >= 500000){
            return (int)(price * 0.8);
        } else if(price >= 300000){
            return (int)(price * 0.9);
        } else if(price >= 100000){
            return (int)(price * 0.95);
        }
        return price;
    }
}
*/