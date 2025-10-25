package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String carName;
    private List<String> moveHistory = new ArrayList<>();

    public String getCarName() {
        return carName;
    }

    public Car(String carName){
        validCarName(carName);
        this.carName = carName;
    }

    public void validCarName(String carName){
        if(carName == null || carName.isBlank()){
            throw new IllegalArgumentException("자동차 이름은 공백일 수 없습니다.");
        }
        if(carName.length() > 5){
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }

    public void move(int randomNumber){
        if (randomNumber >= 4){
            moveHistory.add("-");
        }
    }

    public String moveHistoryByStep(){
        return String.join("", moveHistory);
    }
}
