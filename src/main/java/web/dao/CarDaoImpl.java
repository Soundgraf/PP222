package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>();
    @Override
    public List<Car> carList() {
        cars.add(new Car("NAME1", "COLOR1", 2001));
        cars.add(new Car("NAME2", "COLOR2", 2002));
        cars.add(new Car("NAME3", "COLOR3", 2003));
        cars.add(new Car("NAME4", "COLOR4", 2004));
        cars.add(new Car("NAME5", "COLOR5", 2005));
        return cars;
    }
}
