package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class Racing {

    private Racing() {
    }

    // 시도횟수 입력
    public static int inputTry() {
        System.out.println("시도할 회수");
        return Integer.parseInt(Console.readLine());
    }

    // 자동차 이동
    public static String moveCar(int countAttempt) {
        String result = "";
        for(int i = 0; i < countAttempt; i++){
            int radomsResult = Randoms.pickNumberInRange(1, 9);
            result += (radomsResult > 3) ? "-":"";
        }
        return result;
    }

    // 우승자 확인
    public static String whoIsWinner(String[] players, String[] result) {
        String winners = "";
        String check = "";
        for(int i = 0; i < players.length; i++){
            if(result[i].length() > check.length()) {
                winners = players[i];
                check = result[i];
            } else if(result[i].length() == check.length()){
                winners += "," + players[i];
            }
        }
        return winners;
    }
}
