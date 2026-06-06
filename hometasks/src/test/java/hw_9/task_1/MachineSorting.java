package hw_9.task_1;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MachineSorting {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", 250);
        Car car2 = new Car("Toyota", 220);
        Car car3 = new Car("Ford", 200);
        Car car4 = new Car("Nissan", 210);
        Car car5 = new Car("Mazda", 240);

        SortedSet<Car> cars = new TreeSet<>(Comparator.comparingInt(Car::getSpeed));

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        System.out.println("Cars sorted by speed:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
