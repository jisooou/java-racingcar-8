package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.CarMoveCount;
import racingcar.model.TotalCount;
import racingcar.model.config.RandomGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

public class CarController {
    //    InputView 호출
//    CarMoveCount 호출 - Car와 RandomGenerator 호출됨
//    TotalCount 호출
//    OutputView 호출
    private final InputView inputView = new InputView();
    private final CarMoveCount carMoveCount = new CarMoveCount(new RandomGenerator());
    private final TotalCount totalCount = new TotalCount();
    private final OutputView outputView = new OutputView();

    public void runMain() {
        List<String> carNames = inputView.readCarNameInput();
        int tryCount = inputView.readTryCountInput();

        List<Car> carList = carNames.stream()
                .map(Car::new)
                .toList();

        outputView.printOutputMessage();

        for (int i = 0; i < tryCount; i++) {
            carMoveCount.moveCar(carList);
            outputView.printEachStep(carList);
        }

        List<Car> carWinners = totalCount.findMaxCarMoveCount(carList);
        outputView.printWinners(carWinners);
    }
}
