package model.car;

public abstract class Car {
    protected int numberOfKilometers;
    protected int pricePerHour;
    protected int maxSpeed;
    protected int horsePower;
    protected boolean isAvailable;

    public Car(){
        numberOfKilometers = 0;
        isAvailable = true;
    }

    public abstract String getBrandName();

    public abstract String getGroup();

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public int getHorsePower(){
        return horsePower;
    }

    public int getPricePerHour(){
        return pricePerHour;
    }

    public int getNumberOfKilometers(){
        return numberOfKilometers;
    }

    public void drive(int drivenKilometers){
        numberOfKilometers += drivenKilometers;
        System.out.println(getBrandName() + "is driven!");
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
