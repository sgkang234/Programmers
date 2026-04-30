package level_0;

// 2026.04.29
// 문자열 배열이 주어질 때, 각 원소의 길이를 담은 배열을 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120854

public class _052_배열_원소의_길이 {
    public static void main(String[] args) {
        // 입력
        String[] strList = {"We", "are", "the", "world!"};

        // 로직
        int[] arr = new int[strList.length];
        for (int i = 0; i < strList.length; i++) {
            arr[i] = strList[i].length();
        }

        // 출력
        System.out.println(java.util.Arrays.toString(arr));
    }
}
