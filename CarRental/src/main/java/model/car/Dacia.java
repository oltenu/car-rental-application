package model.car;

public class Dacia extends Car {

    public Dacia() {
        pricePerHour = 10;
        maxSpeed = 180;
        horsePower = 80;
    }

    @Override
    public String getBrandName() {
        return "Dacia";
    }

    @Override
    public String getGroup() {
        return "Renault Group";
    }
}
