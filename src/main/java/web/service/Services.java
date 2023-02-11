package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.Dao;
import web.model.Car;


import java.util.List;

@Service
public class Services {

    private Dao dao;

    @Autowired
    public Services(Dao dao) {
        this.dao = dao;
    }

    public Services() {
    }

    public  List<Car> getCarList (Integer count) {
        return dao.getCarList(count);
    }
}
