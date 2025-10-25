package racingcar.model;

import racingcar.model.config.RandomGenerator;

import java.util.List;

public class CarMoveCount {
    private final RandomGenerator randomGenerator;

    public CarMoveCount(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    public void moveCar(List<Car> carList) {
        for (Car car : carList) {
            int randomNumber = randomGenerator.generateRandomNumber();
            if (randomNumber >= 4) {
                car.move();
            }
        }
    }
}
