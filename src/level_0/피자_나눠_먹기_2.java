package level_0;

// 2026.04.19
// 피자를 여섯 조각으로 했을 때 모든 사람이 같은 피자의 수를 먹을 수 있는 가장 작은 피자 판의 수를 구하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120815

public class 피자_나눠_먹기_2 {
    public static void main(String[] args) {
        // 입력
        int n = 10;

        // 로직
        int gcd = gcd(n);
        int lcm = n * 6 / gcd; // 최소 공배수를 구해서

        // 출력
        System.out.println(lcm/6); // 두 배수가 가지는 가장 작은 값에다 6을 나누어야 피자 판의 수가 나온다.
    }
    static int gcd(int a){
        int b = 6;
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}


