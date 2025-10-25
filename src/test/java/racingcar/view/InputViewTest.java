package racingcar.view;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputViewTest {
    private final InputView inputView = new InputView();

    @Test
    void 쉼표로_구분하지_않은_입력값_예외반환_테스트() {
        String invalidInput = "pobi.javaji";
        assertThatThrownBy(() -> inputView.checkSeparateCarNameByComma(invalidInput))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 쉼표로_구분한_정상_테스트() {
        String validInput = "pobi,javaji";
        inputView.checkSeparateCarNameByComma(validInput);
    }
}
