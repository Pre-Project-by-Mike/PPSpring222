package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarsServiceImpl {

    private CarDaoImpl carDao;

    public CarsServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCars() {
        return carDao.getCars();
    }
    public List<Car> getCars(int count) {
        return carDao.getCars().subList(0, count);
    }
}