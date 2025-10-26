package racingcar;

import racingcar.controller.CarController;
import racingcar.model.CarMoveCount;
import racingcar.model.TotalCount;
import racingcar.model.config.RandomGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        CarMoveCount carMoveCount = new CarMoveCount(new RandomGenerator());
        TotalCount totalCount = new TotalCount();
        OutputView outputView = new OutputView();

        CarController carController = new CarController(inputView, carMoveCount, totalCount, outputView);
        carController.runMain();
    }
}
