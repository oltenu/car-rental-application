package logic;

import model.car.*;

/***
 *  I have implemented a factory design pattern using Car abstract class as a superclass,
 * then I defined 6 subclasses.
 *  This class(CarFactory) is the factory class which helps the user to instantiate Car type
 * objects using a String input.
 */
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
