package model.person;

import model.car.Car;

public class Person {
    private final String firstName;
    private final String lastName;
    private String cnp;
    private int age;
    private String address;
    private int money;
    private Car rentedCar;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        cnp = "";
        age = 18;
        address = "";
        money = 0;
        rentedCar = null;
    }

    public void setRentedCar(Car car){
        if(car == null){
            this.rentedCar = null;
        }else{
            if(this.rentedCar == null){
                this.rentedCar = car;
            }else{
                System.out.println(firstName + lastName + "already has a rented car!");
            }
        }
    }

    public static class PersonBuilder{
        private final Person person;

        public PersonBuilder(String firstName, String lastName){
            person = new Person(firstName, lastName);
        }

        public PersonBuilder withCnp(String cnp){
            this.person.cnp = cnp;
            return this;
        }

        public PersonBuilder withAge(int age){
            this.person.age = age;
            return this;
        }

        public PersonBuilder withAddress(String address){
            this.person.address = address;
            return this;
        }

        public PersonBuilder withMoney(int money){
            this.person.money = money;
            return this;
        }

        public Person build(){
            return this.person;
        }
    }
}
