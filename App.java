package Prak8;

public class App {
    public static void main(String[] args) {
        Owner owner = new Owner("Jeam");
        Car car = new Car(owner, "BMW M2 Competition", 2019, 5200);
        car.displayInfo();
    }
}
