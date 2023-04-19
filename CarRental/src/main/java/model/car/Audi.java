package model.car;

public class Audi extends Car{

    public Audi(){
        pricePerHour = 25;
        maxSpeed = 250;
        horsePower = 140;
    }

    @Override
    public String getBrandName() {
        return "Audi";
    }

    @Override
    public String getGroup() {
        return "Audi Group";
    }
}
