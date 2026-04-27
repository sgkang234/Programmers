package level_1;

// 2026.04.23
// String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12919

public class _011_서울에서_김서방_찾기 {
    public static void main(String[] args) {
        // 입력
        String[] seoul = {"Jane", "Kim"};

        // 로직 및 출력
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                System.out.println("김서방은 " + i + "에 있다");
                break;
            }
        }
    }
}

/*
class Solution {
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }
        return "";
    }
}
 */