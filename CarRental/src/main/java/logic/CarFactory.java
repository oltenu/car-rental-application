package logic;

import model.car.*;

public class CarFactory {
    public static Car getCar(String brand){
        switch (brand) {
            case "Dacia" -> {
                return new Dacia();
            }
            case "Renault" -> {
                return new Renault();
            }
            case "Audi" -> {
                return new Audi();
            }
            case "Ford" -> {
                return new Ford();
            }
            case "Mercedes" -> {
                return new Mercedes();
            }
            case "Volkswagen" -> {
                return new Volkswagen();
            }
        }
        System.out.println("Invalid brand!");
        return null;
    }
}
