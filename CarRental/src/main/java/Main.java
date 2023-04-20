import logic.RentalCompany;
import model.person.Person;

public class Main {
    public static void main(String[] args) {
        RentalCompany rentalCompany = new RentalCompany();
        rentalCompany.acquireCar("Dacia");
        rentalCompany.acquireCar("Mercedes");
        rentalCompany.acquireCar("Renault");
        rentalCompany.acquireCar("Audi");
        rentalCompany.acquireCar("Volkswagen");
        rentalCompany.acquireCar("Ford");

        Person p1 = new Person.PersonBuilder("Ion", "Popescu")
                .withAge(20)
                .withCnp("5020536517581")
                .withAddress("Bucuresti")
                .withMoney(800)
                .build();

        Person p2 = new Person.PersonBuilder("Ana", "Ionescu")
                .withAge(20)
                .withCnp("6082847751515")
                .withMoney(900)
                .build();

        Person p3 = new Person.PersonBuilder("George", "Bud")
                .withAddress("Bucuresti")
                .withMoney(500)
                .build();

        Person p4 = new Person.PersonBuilder("Diana", "Pop")
                .withAge(20)
                .withCnp("5020536517581")
                .withAddress("Bucuresti")
                .build();

        rentalCompany.getCatalogue();
        System.out.println();

        //casual renting
        rentalCompany.rentCar("Dacia", p1, 3);
        p1.getRentedCar().drive(20);
        System.out.println();

        //person does not have enough money
        rentalCompany.rentCar("Mercedes", p4, 4);
        System.out.println();

        //Car not available
        rentalCompany.rentCar("Dacia", p2, 2);
        System.out.println();

        //person already has a rented car
        rentalCompany.rentCar("Renault", p3, 2);
        p3.getRentedCar().drive(10);
        rentalCompany.rentCar("Ford", p3, 2);
        System.out.println();

        //returning a car
        rentalCompany.returnCar(p3);
        rentalCompany.rentCar("Ford", p3, 2);
        System.out.println();

        rentalCompany.getCatalogue();
    }
}
