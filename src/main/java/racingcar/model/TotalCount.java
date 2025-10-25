package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class TotalCount {

    public List<Car> findMaxCarMoveCount(List<Car> carList){
        int maxLength = 0;
        List<Car> carWinners = new ArrayList<>();

        for(Car car : carList){
            int length = car.moveHistoryByStep().length();
            if (length > maxLength){
                maxLength = length;
            }
        }

        for(Car car : carList){
            if(maxLength == car.moveHistoryByStep().length()){
                carWinners.add(car);
            }
        }
        return carWinners;
    }
}
