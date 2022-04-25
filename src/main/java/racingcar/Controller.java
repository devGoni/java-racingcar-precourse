package racingcar;

public class Controller {

    public Controller() {
    }

    public void race() {
        String[] cars = Cars.inputCars();  // 자동차이름
        String[] result = new String[cars.length];  // 결과
        // 시도횟수 입력
        int tryCount = Racing.inputTry();
        // 자동차 이동
        for (int i = 0; i < cars.length; i++) {
            result[i] = Racing.moveCar(tryCount);
        }


        for (int j = 0; j < cars.length; j++) {
            System.out.println(cars[j] + " : " + result[j]);
        }
        String winners = Racing.whoIsWinner(cars, result);

        System.out.println("최종 우승자는 "+ winners +" 입니다.");
    }
}
