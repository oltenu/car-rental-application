package logic;

import model.car.Car;
import model.person.Person;

import java.util.ArrayList;
import java.util.List;

public class RentalCompany {
    List<Car> cars;

    public RentalCompany() {
        cars = new ArrayList<>();
    }

    public void acquireCar(String brand) {
        cars.add(CarFactory.getCar(brand));
    }

    public void getCatalogue() {
        for (Car car : cars) {
            System.out.println("Brand: " + car.getBrandName() + "; Group: " + car.getGroup() + "; Max Speed: "
                    + car.getMaxSpeed() + "; Horse Power: " + car.getHorsePower() + "; Mileage: " + car.getNumberOfKilometers());
        }
    }

    public void rentCar(String brand, Person person, int hours) {
        for (Car car : cars) {
            if (car.getBrandName().equals(brand)) {
                if (car.isAvailable()) {
                    if (car.getPricePerHour() * hours <= person.getMoney()) {
                        if (person.getRentedCar() == null) {
                            car.setAvailable(false);
                            person.setRentedCar(car);
                            person.setMoney(person.getMoney() - car.getPricePerHour() * hours);
                            System.out.println(person.getName() + " has rented a " + car.getBrandName());
                        }else{
                            System.out.println(person.getName() + " has already rented a car!");
                        }
                    }else{
                        System.out.println(person.getName() + " doesn't have enough money!");
                    }
                }else{
                    System.out.println(car.getBrandName() + " is not available!");
                }
            }
        }
    }

    public void returnCar(Person person) {
        for (Car car : cars) {
            if (car == person.getRentedCar()) {
                car.setAvailable(true);
                person.setRentedCar(null);
                System.out.println(person.getName() + " has returned a " + car.getBrandName() + "!");
            }
        }
    }
}
