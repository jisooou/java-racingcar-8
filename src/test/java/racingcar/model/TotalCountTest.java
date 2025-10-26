package racingcar.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TotalCountTest {
    @Test
    void 우승한_자동차_찾는_테스트() {
        Car car1 = new Car("pobi");
        Car car2 = new Car("java");
        Car car3 = new Car("like");

        car1.move();
        car1.move();
        car2.move();
        car3.move();

        List<Car> carList = List.of(car1, car2, car3);
        TotalCount totalCount = new TotalCount();
        List<Car> carWinner = totalCount.findMaxCarMoveCount(carList);

        assertThat(carWinner)
                .extracting(Car::getCarName)
                .containsExactly("pobi");
    }

    @Test
    void 우승한_자동차들_찾는_테스트() {
        Car car1 = new Car("pobi");
        Car car2 = new Car("java");
        Car car3 = new Car("like");

        car1.move();
        car2.move();
        car2.move();
        car3.move();
        car3.move();

        List<Car> carList = List.of(car1, car2, car3);
        TotalCount totalCount = new TotalCount();
        List<Car> carWinners = totalCount.findMaxCarMoveCount(carList);

        assertThat(carWinners)
                .extracting(Car::getCarName)
                .containsExactlyInAnyOrder("java", "like");
    }
}
