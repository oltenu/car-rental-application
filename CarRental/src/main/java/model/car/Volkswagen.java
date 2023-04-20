package model.car;

public class Volkswagen extends Car {

    public Volkswagen() {
        pricePerHour = 20;
        maxSpeed = 220;
        horsePower = 120;
    }

    @Override
    public String getBrandName() {
        return "Volkswagen";
    }

    @Override
    public String getGroup() {
        return "Volkswagen AG";
    }
}
