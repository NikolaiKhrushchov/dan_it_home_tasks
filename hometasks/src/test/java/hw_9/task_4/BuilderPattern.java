package hw_9.task_4;

public class BuilderPattern {
    public static void main(String[] args) {
        Car Car = new Car.Builder()
                .setModel("BMW")
                .setPrice(50000)
                .setMaxSpeed(260)
                .setCountOfWheels(4)
                .build();

        System.out.println(Car);
    }
}
