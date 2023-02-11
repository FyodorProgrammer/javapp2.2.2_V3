package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Dao {
    private static long USER_COUNT;
    private static List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++USER_COUNT, "manufacturer1", "model1", 111));
        cars.add(new Car(++USER_COUNT, "manufacturer2", "model2", 222));
        cars.add(new Car(++USER_COUNT, "manufacturer3", "model3", 333));
        cars.add(new Car(++USER_COUNT, "manufacturer4", "model4", 444));
        cars.add(new Car(++USER_COUNT, "manufacturer5", "model5", 555));
    }

    public List<Car> getCarList (Integer count) {
        if (count == null || count >= cars.size()) return cars;
        return cars.subList(0, count);
    }
}
