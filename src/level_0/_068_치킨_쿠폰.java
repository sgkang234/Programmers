package level_0;

// 2026.05.04
// 쿠폰 10장을 모드면 치킨 한 마리를 서비스로 받을 수 있을 때,
// 치킨 1081마리를 주문하면 쿠폰이 108마리를 주문할 수 있고, 쿠폰이 1장 남는다. 또한, 108마리를 통해 치킨 10마리를 주문할 수 있고 쿠폰 8장이 남는다. 이 10마리를 통해 1마리를 주문할 수 있고 쿠폰 1 받는다. 남은 모든 쿠폰 10개를 모아 치킨 1마리를 시키면 총 120마리를 시킬 수 있다.
// https://school.programmers.co.kr/learn/courses/30/lessons/120884

public class _068_치킨_쿠폰 {
    public static void main(String[] args) {
        // 입력
        int chicken = 100;

        // 로직
        int coupon = 0;
        int serviceChicken = 0;

        while (true) {
            coupon = chicken % 10; // 1, 9, 9, 1
            chicken = chicken / 10; // 108, 10, 0
            serviceChicken += chicken; // 108, 118, 119, 120
            chicken += coupon; // 109, 19, 10
            coupon = 0;
            if(chicken< 10){
                break;
            }
        }

        // 출력
        System.out.println(serviceChicken);
    }
}
/*
class Solution {
    public int solution(int chicken) {
        int coupon = 0;
        int serviceChicken = 0;

        while (true) {
            coupon = chicken % 10; // 1, 9, 9, 1
            chicken = chicken / 10; // 108, 10, 0
            serviceChicken += chicken; // 108, 118, 119, 120
            chicken += coupon; // 109, 19, 10
            coupon = 0;
            if(chicken< 10){
                break;
            }
        }
        return serviceChicken;
    }
}
 */