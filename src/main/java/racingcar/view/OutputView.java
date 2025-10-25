package racingcar.view;

import racingcar.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public void printEachStep(List<Car> carList){
        for (Car car : carList){
            System.out.println(car.getCarName() + " : " + car.moveHistoryByStep());
        }
        System.out.println();
    }

    public void printWinners(List<Car> carList){
        String carWinners = carList.stream()
                .map(Car::getCarName)
                .collect(Collectors.joining(", "));
        System.out.println("최종 우승자 : " + carWinners);
    }
}
