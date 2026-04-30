package level_1;

// 2026.04.29
// 알파벳을 일정한 거리만큼 미렁서 다른 알파벳으로 바꾸는 것을 시저 암호라고 하는데, 문자열 s, 거리 n을 입력받아 s를 n만큼 민 암호문을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/12926

public class _015_시저_암호 {
    public static void main(String[] args) {
        // 입력
        String s = "a B z";
        int n = 4;

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if( c >= 'a' && c <= 'z' ){
                c = (char)('a' + (c - 'a' + n ) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' + n) % 26);
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}


// || c >= 'A' && c <= 'Z' )