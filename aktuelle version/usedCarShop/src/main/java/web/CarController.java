package web;

import entities.Car;
import facades.CarFacade;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;
import java.time.LocalDate;

@Named
@Model
public class CarController {

    @Inject
    CarFacade carFacade;

    public CarController() {
        this.car = new Car();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    Car car;

    public void saveCar(){
        calcSellPrice(car);
        carFacade.save(car);
        car = new Car();
    }

    public void calcSellPrice(Car c){
        double price = c.getManufactoringPrice() - c.getKilometer()*0.01;
        int yearsused = LocalDate.now().getYear() - c.getManufactoringDate();

        price = price - (200 *yearsused);

        if (price < 100){
            price = 100;
        }
        int p = (int)Math.round(price);

        c.setSalePrice(p);

    }

}
