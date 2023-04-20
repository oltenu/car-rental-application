package model.person;

import model.car.Car;

/***
 *  I have implemented a Builder design pattern for all the fields contained in Person Class.
 *  This pattern helps the user to easily instantiate a desired number of fields without needing to instantiate
 * any other fields. It also makes the code cleaner because it eliminates declaration of multiple constructors.
 */
public class Person {
    private final String firstName;
    private final String lastName;
    private String cnp;
    private int age;
    private String address;
    private int money;
    private Car rentedCar;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        cnp = "";
        age = 18;
        address = "";
        money = 0;
        rentedCar = null;
    }

    public void setRentedCar(Car car) {
        rentedCar = car;
    }

    public Car getRentedCar() {
        return rentedCar;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", address: " + address + ", age: " + age + ", cnp: " + cnp;
    }

    public static class PersonBuilder {
        private final Person person;

        public PersonBuilder(String firstName, String lastName) {
            person = new Person(firstName, lastName);
        }

        public PersonBuilder withCnp(String cnp) {
            this.person.cnp = cnp;
            return this;
        }

        public PersonBuilder withAge(int age) {
            this.person.age = age;
            return this;
        }

        public PersonBuilder withAddress(String address) {
            this.person.address = address;
            return this;
        }

        public PersonBuilder withMoney(int money) {
            this.person.money = money;
            return this;
        }

        public Person build() {
            return this.person;
        }
    }
}
