package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> carCountList(int count) {
        List<Car> Cars = carDao.carList();
        if (count == 0 || count > 5) {
            return Cars.subList(0, 5);
        }
        return Cars.subList(0, count);
    }
}
