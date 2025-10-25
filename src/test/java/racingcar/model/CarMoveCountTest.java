package racingcar.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.model.config.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarMoveCountTest {
    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    void 랜덤값이_4이상일때_전진_정상_테스트(int randomNumber) {
        RandomGenerator randomGenerator = new RandomGenerator() {
            @Override
            public int generateRandomNumber() {
                return randomNumber;
            }
        };
        CarMoveCount carMoveCount = new CarMoveCount(randomGenerator);
        Car car = new Car("pobi");
        List<Car> carList = List.of(car);

        carMoveCount.moveCar(carList);
        assertThat(car.moveHistoryByStep()).isEqualTo("-");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void 랜덤값이_4미만일떄_전진_실패_테스트(int randomNumber) {
        RandomGenerator randomGenerator = new RandomGenerator() {
            @Override
            public int generateRandomNumber() {
                return randomNumber;
            }
        };
        CarMoveCount carMoveCount = new CarMoveCount(randomGenerator);
        Car car = new Car("pobi");
        List<Car> carList = List.of(car);

        carMoveCount.moveCar(carList);
        assertThat(car.moveHistoryByStep()).isEqualTo("");
    }
}
