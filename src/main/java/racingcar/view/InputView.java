package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    private static final String INPUT_PROMPT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_PROMPT_NUMBER = "시도할 횟수는 몇 회인가요?";

    public List<String> readCarNameInput(){
        System.out.println(INPUT_PROMPT);
        String input = Console.readLine();
        return Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public String readTryCountInput(){
        System.out.println(INPUT_PROMPT_NUMBER);
        return Console.readLine();
    }
}
