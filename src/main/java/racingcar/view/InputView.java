package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    private static final String INPUT_PROMPT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_PROMPT_NUMBER = "시도할 횟수는 몇 회인가요?";

    public List<String> readCarNameInput() {
        System.out.println(INPUT_PROMPT);
        String input = Console.readLine();
        checkSeparateCarNameByComma(input);
        return parseCarName(input);
    }

    public void checkSeparateCarNameByComma(String input) {
        if (!input.contains(",")) {
            throw new IllegalArgumentException("이름은 쉼표(,) 기준으로 구분해야 합니다.");
        }
    }

    public List<String> parseCarName(String input) {
        return Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public int readTryCountInput() {
        System.out.println(INPUT_PROMPT_NUMBER);
        String input = Console.readLine();
        System.out.println();
        try {
            int tryCount = Integer.parseInt(input);
            if (tryCount < 0) {
                throw new IllegalArgumentException("시도 횟수는 음수가 될 수 없습니다.");
            }
            return tryCount;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 문자가 될 수 없습니다.");
        }
    }
}
