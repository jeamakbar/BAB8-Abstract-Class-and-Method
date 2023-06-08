package Prak8;

public class Car extends Vehicle {
    public Owner owner;

    public Car(Owner owner, String name, int year, double rpm) {
        super(name, year, rpm);
        this.owner = owner;
    }

    public void displayInfo() {
        System.out.println("Car name\t: " + super.getName());
        System.out.println("Car owner\t: " + owner.getName());
        System.out.println("Output year\t: " + super.getYear());
        System.out.println("RPM\t\t: " + super.getRpm());
    }
}