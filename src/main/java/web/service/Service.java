package web.service;

import org.springframework.stereotype.Component;
import web.dao.Dao;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Service{

    public Service() {
    }

    public static List<Car> getCarList (Integer count) {
        return Dao.getCarList(count);
    }
}
