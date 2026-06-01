package hw_12.task_2;

import java.util.Optional;

public class ApplicationOptional {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("BMW", 240, 60000, 4);
        Vehicle emptyCar = null;

        System.out.println("-----With a Car object-----");

        System.out.println("\n-----First method-----");
        Vehicle result = Optional.ofNullable(car).orElse(new Vehicle("", 0, 0, 0));
        System.out.println(result);

        System.out.println("\n-----Second method-----");
        Vehicle result1 = Optional.ofNullable(car).orElseGet(() -> {
            String capacity = "Ford";
            Vehicle resultVehicle = new Vehicle(capacity, 200, 50000, 4);
            return resultVehicle;
        });
        System.out.println(result1);

        System.out.println("\n-----Third method-----");
        Vehicle result3 = Optional.ofNullable(car).orElseGet(() -> new Vehicle("", 0, 0, 0));
        System.out.println(result3);

        System.out.println("\n-----Fourth method-----");
        Vehicle result4 = Optional.ofNullable(car).orElseThrow(() -> new IllegalStateException("List is empty"));
        System.out.println(result4);

        System.out.println("\n-----Fifth method-----");
        Optional.ofNullable(car).ifPresent(x -> System.out.println("The car is: " + x));

        System.out.println("Sixth method");
        Optional.ofNullable(car).ifPresentOrElse(
                x -> System.out.println("The car is: " + x),
                () -> System.out.println("The car is empty")
        );

        System.out.println("-----With a emptyCar object-----");

        System.out.println("\n-----First method-----");
        Vehicle resultEmpty = Optional.ofNullable(emptyCar).orElse(new Vehicle("", 0, 0, 0));
        System.out.println(resultEmpty);

        System.out.println("\n-----Second method-----");
        Vehicle resultEmpty1 = Optional.ofNullable(emptyCar).orElseGet(() -> {
            String capacity = "Ford";
            Vehicle resultVehicle = new Vehicle(capacity, 200, 50000, 4);
            return resultVehicle;
        });
        System.out.println(resultEmpty1);

        System.out.println("\n-----Third method-----");
        Vehicle resultEmpty2 = Optional.ofNullable(emptyCar).orElseGet(() -> new Vehicle("", 0, 0, 0));
        System.out.println(resultEmpty2);

        System.out.println("\n-----Fourth method-----");
        Vehicle resultEmpty3 = Optional.ofNullable(emptyCar).orElseThrow(() -> new IllegalStateException("List is empty"));
        System.out.println(resultEmpty3);

        System.out.println("\n-----Fifth method-----");
        Optional.ofNullable(emptyCar).ifPresent(x -> System.out.println("The car is: " + x));

        System.out.println("Sixth method");
        Optional.ofNullable(emptyCar).ifPresentOrElse(
                x -> System.out.println("The car is: " + x),
                () -> System.out.println("The car is empty")
        );

    }
}
