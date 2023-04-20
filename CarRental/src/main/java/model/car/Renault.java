package model.car;

public class Renault extends Car {

    public Renault() {
        pricePerHour = 20;
        maxSpeed = 240;
        horsePower = 110;
    }

    @Override
    public String getBrandName() {
        return "Renault";
    }

    @Override
    public String getGroup() {
        return "Renault Group";
    }
}
