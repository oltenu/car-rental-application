package model.car;

public class Mercedes extends Car {

    public Mercedes() {
        pricePerHour = 30;
        maxSpeed = 300;
        horsePower = 180;
    }

    @Override
    public String getBrandName() {
        return "Mercedes";
    }

    @Override
    public String getGroup() {
        return "Mercedes-Benz Group AG";
    }
}
