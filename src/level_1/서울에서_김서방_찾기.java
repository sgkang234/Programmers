package level_1;

public class 서울에서_김서방_찾기 {
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

 */