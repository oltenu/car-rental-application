package model.car;

public class Ford extends Car {

    public Ford() {
        pricePerHour = 15;
        maxSpeed = 200;
        horsePower = 100;
    }

    @Override
    public String getBrandName() {
        return "Ford";
    }

    @Override
    public String getGroup() {
        return "Ford Motors";
    }
}
