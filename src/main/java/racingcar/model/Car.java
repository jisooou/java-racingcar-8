package racingcar.model;

public class Car {
    private String carName;

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
}
