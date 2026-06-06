package hw_6.task_2;

public class PassengersAndCargo {
    public static void main(String[] args) {
        Car car = new Car("Korch", 350, 8);
        car.move();

        Truck truck = new Truck("Ferrari", 400, 300);
        truck.move();
    }
}
