package level_1;

import java.util.Arrays;

public class _022_제일_작은_수_제거하기 {
    public static void main(String[] args) {
        // 입력
        int[] arr = {4, 3, 2, 1};

        // 로직
        if(arr.length < 2) {
            System.out.println(Arrays.toString(new int[]{-1}));
            return;
        }

        int min = Arrays.stream(arr).min().getAsInt();

        int[] answer = new int[arr.length-1];
        int index = 0;
        for (int num : arr) {
            if (num != min){
                answer[index++] = num;
            }
        }


        // 출력
        System.out.println(Arrays.toString(answer));
    }
}
