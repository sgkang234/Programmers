package level_0;

// 2026.04.27
// 가위는 2, 바위는 0, 보는 5일때, 가위바위보를 모두 이기는 경우를 순서대로 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120839

public class _037_가위_바위_보 {
    public static void main(String[] args) {
        // 입력
        String rsp = "205";

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);

            if (c == '2') {
                sb.append("0");
            } else if (c == '0') {
                sb.append("5");
            } else {
                sb.append("2");
            }
        }

        // 출력
        System.out.println(sb);
    }
}
