package level_0;

// 2026.05.04
// 정수 n을 기준으로 n과 가까운 수부터 정렬한다. 만약 거리가 같다면 더 큰 수를 앞에 오도록한 뒤 출력하는 문제
// https://school.programmers.co.kr/learn/courses/30/lessons/120883

public class _067_로그인_성공 {
    public static void main(String[] args) {
        // 입력
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {
                {"rardss", "123"},
                {"yyoom", "1234"},
                {"meosseugi", "1234"}
        };

        // 로직
        String answer = "";
        for (int i = 0; i < db.length; i++) {
            if(db[i][0].equals(id_pw[0])){
                if(db[i][1].equals(id_pw[1])){
                    answer = "login";
                    break;
                } else{
                    answer = "wrong pw";
                    break;
                }
            }  else{
                answer = "fail";
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/*
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for (int i = 0; i < db.length; i++) {
            if(db[i][0].equals(id_pw[0])){
                if(db[i][1].equals(id_pw[1])){
                    answer = "login";
                    break;
                } else{
                    answer = "wrong pw";
                    break;
                }
            }  else{
                answer = "fail";
            }
        }
        return answer;
    }
}
 */